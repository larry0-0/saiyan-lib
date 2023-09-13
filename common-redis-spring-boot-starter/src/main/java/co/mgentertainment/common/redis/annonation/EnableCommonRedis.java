package co.mgentertainment.common.redis.annonation;

import co.mgentertainment.common.redis.config.CommonRedisAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author larry
 * @createTime 21/08/2023
 * @description EnableCommonRedis
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(CommonRedisAutoConfiguration.class)
public @interface EnableCommonRedis {
}
