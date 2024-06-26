package co.saiyan.common.schedulerplus.support;

import co.saiyan.common.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author larry
 * @createTime 26/10/2023
 * @description SchedulerPlusLogRepository
 */
public class SchedulerPlusLogRepository implements InitializingBean {

    private static final String SQL_QUERY_LOG = "select id, scheduler_id, failed, info, run_start_time, run_end_time, create_time, updated_time, deleted from scheduler_plus_log where deleted=0 and scheduler_id=? and create_time < ? limit ? order by create_time desc";
    private static final String SQL_INSERT_LOG = "insert into scheduler_plus_log(scheduler_id, run_start_time) values('%s',now())";
    private static final String SQL_UPDATE_LOG = "update scheduler_plus_log set failed=?, info=?, run_end_time=now() where id=?";
    private static final String SQL_REMOVE_LOG = "update scheduler_plus_log set deleted=1 where id=?";

    private JdbcTemplate jdbcTemplate;

    private final DataSource schedulerPlusDataSource;

    public SchedulerPlusLogRepository(@Qualifier("schedulerPlusDataSource") DataSource schedulerPlusDataSource) {
        this.schedulerPlusDataSource = schedulerPlusDataSource;
    }

    @Override
    public void afterPropertiesSet() {
        this.jdbcTemplate = new JdbcTemplate(schedulerPlusDataSource);
    }

    /**
     * 游标分页查询
     *
     * @param schedulerId
     * @param lastRecordCreateTime 上一次查询的最后一天记录的创建时间
     * @param limit
     * @return
     */
    public List<SchedulerPlusLogDO> listLog(String schedulerId, Date lastRecordCreateTime, int limit) {
        return jdbcTemplate.query(SQL_QUERY_LOG, new Object[]{schedulerId, DateUtils.format(lastRecordCreateTime), limit},
                (rs, rownumber) -> {
                    SchedulerPlusLogDO log = new SchedulerPlusLogDO();
                    log.setId(rs.getLong(1));
                    log.setSchedulerId(rs.getString(2));
                    log.setFailed(rs.getInt(3));
                    log.setInfo(rs.getString(4));
                    log.setRunStartTime(rs.getDate(5));
                    log.setRunEndTime(rs.getDate(6));
                    log.setCreateTime(rs.getDate(7));
                    log.setUpdatedTime(rs.getDate(8));
                    log.setDeleted(rs.getByte(9));
                    return log;
                });
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public Long createLog(String schedulerId) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        PreparedStatementCreator preparedStatementCreator = con -> {
            PreparedStatement ps = con.prepareStatement(String.format(SQL_INSERT_LOG, schedulerId), Statement.RETURN_GENERATED_KEYS);
            return ps;
        };
        jdbcTemplate.update(preparedStatementCreator, keyHolder);
        return keyHolder.getKey().longValue();
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public boolean updateLog(Long id, Integer failed, String info) {
        return jdbcTemplate.update(SQL_UPDATE_LOG,
                failed,
                Optional.ofNullable(info).orElse(StringUtils.EMPTY),
                id) > 0;
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public boolean removeLogForSchedulerId(Long id) {
        return jdbcTemplate.update(SQL_REMOVE_LOG, id) > 0;
    }
}
