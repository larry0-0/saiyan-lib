package co.saiyan.common.schedulerplus.support;

import co.saiyan.common.utils.DateUtils;

import java.util.Date;

/**
 * @author larry
 * @createTime 2023/10/26
 * @description SchedulerIdGenerator
 */
public class SchedulerIdGenerator {

    public static String generate() {
        return "spt" + DateUtils.format(new Date(), "yyMMddHHmmssSSS");
    }
}
