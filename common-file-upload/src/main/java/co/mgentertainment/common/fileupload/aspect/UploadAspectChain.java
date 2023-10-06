package co.mgentertainment.common.fileupload.aspect;

import co.mgentertainment.common.fileupload.FileInfo;
import co.mgentertainment.common.fileupload.UploadPretreatment;
import co.mgentertainment.common.fileupload.platform.FileStorage;
import co.mgentertainment.common.fileupload.recorder.FileRecorder;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;

/**
 * 上传的切面调用链
 */
@Getter
@Setter
public class UploadAspectChain {

    private UploadAspectChainCallback callback;
    private Iterator<FileStorageAspect> aspectIterator;

    public UploadAspectChain(Iterable<FileStorageAspect> aspects,UploadAspectChainCallback callback) {
        this.aspectIterator = aspects.iterator();
        this.callback = callback;
    }

    /**
     * 调用下一个切面
     */
    public FileInfo next(FileInfo fileInfo, UploadPretreatment pre, FileStorage fileStorage, FileRecorder fileRecorder) {
        if (aspectIterator.hasNext()) {//还有下一个
            return aspectIterator.next().uploadAround(this,fileInfo,pre,fileStorage,fileRecorder);
        } else {
            return callback.run(fileInfo,pre,fileStorage,fileRecorder);
        }
    }
}
