package co.mgentertainment.common.fileupload.aspect;

import co.mgentertainment.common.fileupload.FileInfo;
import co.mgentertainment.common.fileupload.platform.FileStorage;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;

/**
 * 获取缩略图文件的访问控制列表的切面调用链
 */
@Getter
@Setter
public class SetThFileAclAspectChain {

    private SetThFileAclAspectChainCallback callback;
    private Iterator<FileStorageAspect> aspectIterator;

    public SetThFileAclAspectChain(Iterable<FileStorageAspect> aspects,SetThFileAclAspectChainCallback callback) {
        this.aspectIterator = aspects.iterator();
        this.callback = callback;
    }

    /**
     * 调用下一个切面
     */
    public boolean next(FileInfo fileInfo, Object acl, FileStorage fileStorage) {
        if (aspectIterator.hasNext()) {//还有下一个
            return aspectIterator.next().setThFileAcl(this,fileInfo,acl,fileStorage);
        } else {
            return callback.run(fileInfo,acl,fileStorage);
        }
    }
}
