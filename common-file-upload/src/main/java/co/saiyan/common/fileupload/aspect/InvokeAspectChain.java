package co.saiyan.common.fileupload.aspect;

import co.saiyan.common.fileupload.platform.FileStorage;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;

/**
 * 通过反射调用指定存储平台的方法的切面调用链
 */
@Getter
@Setter
public class InvokeAspectChain {

    private InvokeAspectChainCallback callback;
    private Iterator<FileStorageAspect> aspectIterator;

    public InvokeAspectChain(Iterable<FileStorageAspect> aspects,InvokeAspectChainCallback callback) {
        this.aspectIterator = aspects.iterator();
        this.callback = callback;
    }

    /**
     * 调用下一个切面
     */
    public <T> T next(FileStorage fileStorage, String method, Object[] args) {
        if (aspectIterator.hasNext()) {//还有下一个
            return aspectIterator.next().invoke(this,fileStorage,method,args);
        } else {
            return callback.run(fileStorage,method,args);
        }
    }
}
