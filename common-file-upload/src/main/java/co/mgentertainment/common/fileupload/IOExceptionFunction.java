package co.mgentertainment.common.fileupload;

import java.io.IOException;

/**
 * 带 IOException 异常的 Function
 */
public interface IOExceptionFunction<T,R> {
    R apply(T t) throws IOException;
}
