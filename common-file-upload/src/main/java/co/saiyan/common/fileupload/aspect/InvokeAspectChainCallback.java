package co.saiyan.common.fileupload.aspect;

import co.saiyan.common.fileupload.platform.FileStorage;

/**
 * 通过反射调用指定存储平台的方法的切面调用链结束回调
 */
public interface InvokeAspectChainCallback {
    <T> T run(FileStorage fileStorage, String method, Object[] args);
}
