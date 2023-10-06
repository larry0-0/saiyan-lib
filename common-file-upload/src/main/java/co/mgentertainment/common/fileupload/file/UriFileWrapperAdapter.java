package co.mgentertainment.common.fileupload.file;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import co.mgentertainment.common.fileupload.tika.ContentTypeDetect;
import co.mgentertainment.common.fileupload.util.Tools;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * URI文件包装适配器，兼容Spring的ClassPath路径、文件路径、HTTP路径等
 */
@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UriFileWrapperAdapter implements FileWrapperAdapter {
    private ContentTypeDetect contentTypeDetect;

    @Override
    public boolean isSupport(Object source) {
        if (source instanceof UriFileWrapper) return true;
        if (source instanceof URL) return true;
        if (source instanceof URI) return true;
        if (source instanceof String) {
            try {
                URLUtil.url((String) source);
                return true;
            } catch (Exception ignored) {
            }
        }
        return false;
    }

    @Override
    public FileWrapper getFileWrapper(Object source,String name,String contentType,Long size) throws IOException {
        if (source instanceof UriFileWrapper) {
            return updateFileWrapper((UriFileWrapper) source,name,contentType,size);
        }
        URL url;
        if (source instanceof URI) {
            url = ((URI) source).toURL();
        } else if (source instanceof String) {
            url = URLUtil.url((String) source);
        } else {
            url = (URL) source;
        }

        URLConnection conn = url.openConnection();
        InputStream inputStream = IoUtil.toMarkSupportStream(conn.getInputStream());

        if (name == null) name = getName(conn,url);
        if (size == null) {
            size = conn.getContentLengthLong();
            if (size < 0) size = null;
        }
        UriFileWrapper wrapper = new UriFileWrapper(inputStream,name,contentType,size);
        if (contentType == null) {
            wrapper.getInputStreamMaskReset(in -> wrapper.setContentType(contentTypeDetect.detect(in,wrapper.getName())));
        }
        return handleSize(wrapper);
    }

    public String getName(URLConnection conn,URL url) {
        String name = "";
        String disposition = conn.getHeaderField("Content-Disposition");
        if (StrUtil.isNotBlank(disposition)) {
            name = ReUtil.get("filename=\"(.*?)\"",disposition,1);
            if (StrUtil.isBlank(name)) {
                name = StrUtil.subAfter(disposition,"filename=",true);
            }
        }
        if (StrUtil.isBlank(name)) {
            final String path = url.getPath();
            name = StrUtil.subSuf(path,path.lastIndexOf('/') + 1);
            if (StrUtil.isNotBlank(name)) {
                name = URLUtil.decode(name,StandardCharsets.UTF_8);
            }
        }
        return name;
    }

    /**
     * 处理文件 size
     */
    public FileWrapper handleSize(FileWrapper fileWrapper) throws IOException {
        if (fileWrapper.getSize() == null) {
            log.warn("构造 URLFileWrapper 时未传入 size 参数，尝试从 URLConnection 中获取 size 失败，将通过读取全部字节方式获取 size ，这种方式将占用大量内存，如果明确知道此 InputStream 的长度，请传入 size 参数！");
            fileWrapper.setSize(fileWrapper.getInputStreamMaskResetReturn(Tools::getSize));
        }
        return fileWrapper;
    }

}
