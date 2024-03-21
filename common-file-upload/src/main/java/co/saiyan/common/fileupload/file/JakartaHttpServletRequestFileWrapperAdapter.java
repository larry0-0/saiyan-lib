package co.saiyan.common.fileupload.file;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * 针对 jakarta 的 HttpServletRequest 文件包装适配器
 */
@Slf4j
@Getter
@Setter
public class JakartaHttpServletRequestFileWrapperAdapter implements FileWrapperAdapter {

    @Override
    public boolean isSupport(Object source) {
        if (source instanceof HttpServletRequest) {
            HttpServletRequest request = (HttpServletRequest) source;
            String contentType = request.getContentType();
            return contentType != null && contentType.toLowerCase().trim().startsWith("multipart/form-data");
        }
        return source instanceof HttpServletRequestFileWrapper;
    }

    @Override
    public FileWrapper getFileWrapper(Object source,String name,String contentType,Long size) throws IOException {
        if (source instanceof HttpServletRequestFileWrapper) {
            return updateFileWrapper((HttpServletRequestFileWrapper) source,name,contentType,size);
        } else {
            HttpServletRequest request = (HttpServletRequest) source;
            Charset charset = Charset.forName(request.getCharacterEncoding());
            MultipartFormDataReader.MultipartFormData data = MultipartFormDataReader.read(request.getContentType(),request.getInputStream(),charset,request.getContentLengthLong());

            if (name == null) name = data.getFileOriginalFilename();
            if (contentType == null) contentType = data.getFileContentType();
            if (size == null) size = data.getFileSize();
            return new HttpServletRequestFileWrapper(data.getInputStream(),name,contentType,size,data);
        }
    }


}
