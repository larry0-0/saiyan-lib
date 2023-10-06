package co.mgentertainment.common.fileupload.aspect;

import co.mgentertainment.common.fileupload.platform.FileStorage;

/**
 * 是否支持文件的访问控制列表 切面调用链结束回调
 */
public interface IsSupportAclAspectChainCallback {
    boolean run(FileStorage fileStorage);
}
