package co.mgentertainment.common.fileupload.file;

import co.mgentertainment.common.fileupload.tika.ContentTypeDetect;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * byte[] 文件包装适配器
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ByteFileWrapperAdapter implements FileWrapperAdapter {
    private ContentTypeDetect contentTypeDetect;

    @Override
    public boolean isSupport(Object source) {
        return source instanceof byte[] || source instanceof ByteFileWrapper;
    }

    @Override
    public FileWrapper getFileWrapper(Object source,String name,String contentType,Long size) {
        if (source instanceof ByteFileWrapper) {
            return updateFileWrapper((ByteFileWrapper) source,name,contentType,size);
        } else {
            byte[] bytes = (byte[]) source;
            if (name == null) name = "";
            if (contentType == null) contentType = contentTypeDetect.detect(bytes,name);
            if (size == null) size = (long) bytes.length;
            return new ByteFileWrapper(bytes,name,contentType,size);
        }
    }
}
