package co.saiyan.common.schedulerplus;

import co.saiyan.common.devent.DistributedEventProvider;
import co.saiyan.common.devent.annonation.EnableDistributedEvent;
import co.saiyan.common.schedulerplus.core.SchedulerPlusCache;
import co.saiyan.common.schedulerplus.initial.SchedulerPlusApplicationRunner;
import co.saiyan.common.schedulerplus.initial.SchedulerPlusJobPostProcessor;
import co.saiyan.common.schedulerplus.properties.ThreadPoolTaskSchedulerProperties;
import co.saiyan.common.schedulerplus.strengthen.LockStrengthen;
import co.saiyan.common.schedulerplus.strengthen.LogStrengthen;
import co.saiyan.common.schedulerplus.support.SchedulerPlusLogRepository;
import co.saiyan.common.schedulerplus.support.SchedulerPlusTaskRepository;
import co.saiyan.dlock.annotation.EnableDistributedLock;
import co.saiyan.dlock.registry.LockRegistry;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import javax.sql.DataSource;

/**
 * @author larry
 * @createTime 2023/10/25
 * @description SchedulerPlusAutoConfiguration
 */
@Configuration
@EnableDistributedLock
@EnableDistributedEvent
@EnableConfigurationProperties(value = {ThreadPoolTaskSchedulerProperties.class})
public class SchedulerPlusAutoConfiguration {

    @Bean(name = "spTaskScheduler")
    public ThreadPoolTaskScheduler spTaskScheduler(ThreadPoolTaskSchedulerProperties threadPoolTaskSchedulerProperties) {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(threadPoolTaskSchedulerProperties.getPoolSize());
        taskScheduler.setThreadNamePrefix(threadPoolTaskSchedulerProperties.getThreadNamePrefix());
        taskScheduler.setWaitForTasksToCompleteOnShutdown(threadPoolTaskSchedulerProperties.getWaitForTasksToCompleteOnShutdown());
        taskScheduler.setAwaitTerminationSeconds(threadPoolTaskSchedulerProperties.getAwaitTerminationSeconds());
        taskScheduler.initialize();
        return taskScheduler;
    }

    @Bean(name = "schedulerPlusDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource schedulerPlusDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public SchedulerPlusTaskRepository schedulerPlusTaskRepository(@Qualifier("schedulerPlusDataSource") DataSource schedulerPlusDataSource) {
        return new SchedulerPlusTaskRepository(schedulerPlusDataSource);
    }

    @Bean
    public SchedulerPlusLogRepository schedulerPlusLogRepository(@Qualifier("schedulerPlusDataSource") DataSource schedulerPlusDataSource) {
        return new SchedulerPlusLogRepository(schedulerPlusDataSource);
    }

    @Bean
    public SchedulerPlusCache schedulerPlusCache() {
        return new SchedulerPlusCache();
    }

    @Bean
    @DependsOn("lockRegistry")
    @ConditionalOnProperty(prefix = "scheduler-plus.plugin", name = "lock", havingValue = "true")
    @ConditionalOnMissingBean
    public LockStrengthen lockStrengthen(@Qualifier("lockRegistry") LockRegistry lockRegistry) {
        return new LockStrengthen(lockRegistry);
    }

    @Bean
    @ConditionalOnProperty(prefix = "scheduler-plus.plugin", name = "log", havingValue = "true")
    @ConditionalOnMissingBean
    public LogStrengthen logStrengthen(SchedulerPlusTaskRepository schedulerPlusTaskRepository, SchedulerPlusLogRepository schedulerPlusLogRepository) {
        return new LogStrengthen(schedulerPlusTaskRepository, schedulerPlusLogRepository);
    }

    @Bean
    public SchedulerPlusJobPostProcessor schedulerPlusJobPostProcessor(SchedulerPlusCache schedulerPlusCache) {
        return new SchedulerPlusJobPostProcessor(schedulerPlusCache);
    }

    @Bean
    public SchedulerPlusApplicationRunner schedulerPlusApplicationRunner(@Qualifier("spTaskScheduler") ThreadPoolTaskScheduler spTaskScheduler, SchedulerPlusCache schedulerPlusCache, SchedulerPlusTaskRepository schedulerPlusTaskRepository) {
        return new SchedulerPlusApplicationRunner(spTaskScheduler, schedulerPlusCache, schedulerPlusTaskRepository);
    }

    @Bean
    public SchedulerPlusManager schedulerPlusManager(SchedulerPlusCache schedulerPlusCache, DistributedEventProvider distributedEventProvider, SchedulerPlusTaskRepository schedulerPlusTaskRepository, SchedulerPlusLogRepository schedulerPlusLogRepository) {
        return new SchedulerPlusManager(schedulerPlusCache, distributedEventProvider, schedulerPlusTaskRepository, schedulerPlusLogRepository);
    }

}
