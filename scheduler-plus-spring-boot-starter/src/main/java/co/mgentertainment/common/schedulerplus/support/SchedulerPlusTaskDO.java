package co.mgentertainment.common.schedulerplus.support;

import java.util.Date;

public class SchedulerPlusTaskDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.scheduler_id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private String schedulerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.scheduled_mode
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Integer scheduledMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.job_name
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private String jobName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.cron_expression
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private String cronExpression;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.task_args
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private String taskArgs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.task_desc
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private String taskDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.task_status
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Integer taskStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.create_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.updated_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Date updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_plus_task.deleted
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.scheduler_id
     *
     * @return the value of scheduler_plus_task.scheduler_id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public String getSchedulerId() {
        return schedulerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.scheduler_id
     *
     * @param schedulerId the value for scheduler_plus_task.scheduler_id
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setSchedulerId(String schedulerId) {
        this.schedulerId = schedulerId == null ? null : schedulerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.scheduled_mode
     *
     * @return the value of scheduler_plus_task.scheduled_mode
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Integer getScheduledMode() {
        return scheduledMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.scheduled_mode
     *
     * @param scheduledMode the value for scheduler_plus_task.scheduled_mode
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setScheduledMode(Integer scheduledMode) {
        this.scheduledMode = scheduledMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.job_name
     *
     * @return the value of scheduler_plus_task.job_name
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.job_name
     *
     * @param jobName the value for scheduler_plus_task.job_name
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.cron_expression
     *
     * @return the value of scheduler_plus_task.cron_expression
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.cron_expression
     *
     * @param cronExpression the value for scheduler_plus_task.cron_expression
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.task_args
     *
     * @return the value of scheduler_plus_task.task_args
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public String getTaskArgs() {
        return taskArgs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.task_args
     *
     * @param taskArgs the value for scheduler_plus_task.task_args
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setTaskArgs(String taskArgs) {
        this.taskArgs = taskArgs == null ? null : taskArgs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.task_desc
     *
     * @return the value of scheduler_plus_task.task_desc
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.task_desc
     *
     * @param taskDesc the value for scheduler_plus_task.task_desc
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc == null ? null : taskDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.task_status
     *
     * @return the value of scheduler_plus_task.task_status
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.task_status
     *
     * @param taskStatus the value for scheduler_plus_task.task_status
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.create_time
     *
     * @return the value of scheduler_plus_task.create_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.create_time
     *
     * @param createTime the value for scheduler_plus_task.create_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.updated_time
     *
     * @return the value of scheduler_plus_task.updated_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.updated_time
     *
     * @param updatedTime the value for scheduler_plus_task.updated_time
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_plus_task.deleted
     *
     * @return the value of scheduler_plus_task.deleted
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_plus_task.deleted
     *
     * @param deleted the value for scheduler_plus_task.deleted
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduler_plus_task
     *
     * @mbg.generated Thu Oct 26 04:25:20 GST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schedulerId=").append(schedulerId);
        sb.append(", scheduledMode=").append(scheduledMode);
        sb.append(", jobName=").append(jobName);
        sb.append(", cronExpression=").append(cronExpression);
        sb.append(", taskArgs=").append(taskArgs);
        sb.append(", taskDesc=").append(taskDesc);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}