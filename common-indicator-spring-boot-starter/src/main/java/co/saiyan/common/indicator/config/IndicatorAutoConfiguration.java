package co.saiyan.common.indicator.config;

import co.saiyan.common.indicator.IndicatorCollector;
import co.saiyan.common.indicator.aspect.GlobalIndicatorAspect;
import co.saiyan.common.indicator.aspect.ItemIndicatorAspect;
import co.saiyan.common.redis.annonation.EnableCommonRedis;
import co.saiyan.common.redis.service.RedisService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author larry
 * @createTime 2023/9/30
 * @description IndicatorAutoConfiguration
 */
@Configuration
@EnableCommonRedis
public class IndicatorAutoConfiguration {

    @Bean(name = "indicatorCollector")
    public IndicatorCollector indicatorCollector(final RedisService redisService) {
        return new IndicatorCollector(redisService);
    }

    @Bean(name = "itemIndicatorAspect")
    public ItemIndicatorAspect itemIndicatorAspect(final RedisService redisService) {
        return new ItemIndicatorAspect(redisService);
    }

    @Bean(name = "globalIndicatorAspect")
    public GlobalIndicatorAspect globalIndicatorAspect(final RedisService redisService) {
        return new GlobalIndicatorAspect(redisService);
    }
}
