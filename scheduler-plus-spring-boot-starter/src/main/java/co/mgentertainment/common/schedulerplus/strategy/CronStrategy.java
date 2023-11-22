package co.mgentertainment.common.schedulerplus.strategy;


import co.mgentertainment.common.schedulerplus.core.SchedulerPlusExecutor;
import co.mgentertainment.common.schedulerplus.core.SchedulerPlusMeta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

import java.util.Optional;
import java.util.concurrent.ScheduledFuture;

/**
 * @author larry
 * @createTime 2023/10/26
 * @description CronStrategy
 */
@Slf4j
public class CronStrategy implements ScheduleStrategy {

    @Override
    public ScheduledFuture<?> schedule(@Qualifier("spTaskScheduler") ThreadPoolTaskScheduler spTaskScheduler, SchedulerPlusExecutor executor) {
        String cronExpression = Optional.ofNullable(executor.getMetadata()).orElse(SchedulerPlusMeta.builder().build()).getStrategyValue();
        log.info("启动CronStrategy定时任务, cronExp: {}", cronExpression);
        return spTaskScheduler.schedule(() -> executor.invoke(), new CronTrigger(cronExpression));
    }
}
