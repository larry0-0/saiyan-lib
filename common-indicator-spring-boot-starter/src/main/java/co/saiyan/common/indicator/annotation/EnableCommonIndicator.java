package co.saiyan.common.indicator.annotation;

import co.saiyan.common.indicator.config.IndicatorAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author larry
 * @createTime 21/08/2023
 * @description EnableCommonIndicator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({IndicatorAutoConfiguration.class})
public @interface EnableCommonIndicator {


}
