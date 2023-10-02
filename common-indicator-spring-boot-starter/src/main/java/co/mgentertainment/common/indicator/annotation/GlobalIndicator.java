package co.mgentertainment.common.indicator.annotation;

import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.*;

/**
 * @author larry
 * @desc 全局指标采集注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GlobalIndicator {

    /**
     * 指标名称
     *
     * @return {String}
     */
    String name() default StringUtils.EMPTY;

}