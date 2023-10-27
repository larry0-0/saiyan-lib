package co.mgentertainment.common.schedulerplus.support;

import java.util.Date;

public class SchedulerPlusLogDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.scheduler_id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private String schedulerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.failed
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Integer failed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.info
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private String info;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.run_start_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Date runStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.run_end_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Date runEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.create_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.updated_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Date updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_log.deleted
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.id
     *
     * @return the value of scheduler_plus_log.id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.id
     *
     * @param id the value for scheduler_plus_log.id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.scheduler_id
     *
     * @return the value of scheduler_plus_log.scheduler_id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public String getSchedulerId() {
        return schedulerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.scheduler_id
     *
     * @param schedulerId the value for scheduler_plus_log.scheduler_id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setSchedulerId(String schedulerId) {
        this.schedulerId = schedulerId == null ? null : schedulerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.failed
     *
     * @return the value of scheduler_plus_log.failed
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.failed
     *
     * @param failed the value for scheduler_plus_log.failed
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.info
     *
     * @return the value of scheduler_plus_log.info
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.info
     *
     * @param info the value for scheduler_plus_log.info
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.run_start_time
     *
     * @return the value of scheduler_plus_log.run_start_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Date getRunStartTime() {
        return runStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.run_start_time
     *
     * @param runStartTime the value for scheduler_plus_log.run_start_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setRunStartTime(Date runStartTime) {
        this.runStartTime = runStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.run_end_time
     *
     * @return the value of scheduler_plus_log.run_end_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Date getRunEndTime() {
        return runEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.run_end_time
     *
     * @param runEndTime the value for scheduler_plus_log.run_end_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setRunEndTime(Date runEndTime) {
        this.runEndTime = runEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.create_time
     *
     * @return the value of scheduler_plus_log.create_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.create_time
     *
     * @param createTime the value for scheduler_plus_log.create_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.updated_time
     *
     * @return the value of scheduler_plus_log.updated_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.updated_time
     *
     * @param updatedTime the value for scheduler_plus_log.updated_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_log.deleted
     *
     * @return the value of scheduler_plus_log.deleted
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_log.deleted
     *
     * @param deleted the value for scheduler_plus_log.deleted
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduler_plus_log
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schedulerId=").append(schedulerId);
        sb.append(", failed=").append(failed);
        sb.append(", info=").append(info);
        sb.append(", runStartTime=").append(runStartTime);
        sb.append(", runEndTime=").append(runEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}