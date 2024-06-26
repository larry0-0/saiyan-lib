package co.saiyan.common.security.dal.po;

import java.util.Date;

public class SysMenuDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menu_id
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private Long menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.parent_id
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.name
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.path
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.permission
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.icon
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.sort_order
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.keep_alive
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String keepAlive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.type
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.del_flag
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.create_by
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.create_time
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.update_by
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.update_time
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_id
     *
     * @return the value of sys_menu.menu_id
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_id
     *
     * @param menuId the value for sys_menu.menu_id
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.parent_id
     *
     * @return the value of sys_menu.parent_id
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.parent_id
     *
     * @param parentId the value for sys_menu.parent_id
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.name
     *
     * @return the value of sys_menu.name
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.name
     *
     * @param name the value for sys_menu.name
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.path
     *
     * @return the value of sys_menu.path
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.path
     *
     * @param path the value for sys_menu.path
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.permission
     *
     * @return the value of sys_menu.permission
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.permission
     *
     * @param permission the value for sys_menu.permission
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.icon
     *
     * @return the value of sys_menu.icon
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.icon
     *
     * @param icon the value for sys_menu.icon
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.sort_order
     *
     * @return the value of sys_menu.sort_order
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.sort_order
     *
     * @param sortOrder the value for sys_menu.sort_order
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.keep_alive
     *
     * @return the value of sys_menu.keep_alive
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getKeepAlive() {
        return keepAlive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.keep_alive
     *
     * @param keepAlive the value for sys_menu.keep_alive
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive == null ? null : keepAlive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.type
     *
     * @return the value of sys_menu.type
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.type
     *
     * @param type the value for sys_menu.type
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.del_flag
     *
     * @return the value of sys_menu.del_flag
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.del_flag
     *
     * @param delFlag the value for sys_menu.del_flag
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.create_by
     *
     * @return the value of sys_menu.create_by
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.create_by
     *
     * @param createBy the value for sys_menu.create_by
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.create_time
     *
     * @return the value of sys_menu.create_time
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.create_time
     *
     * @param createTime the value for sys_menu.create_time
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.update_by
     *
     * @return the value of sys_menu.update_by
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.update_by
     *
     * @param updateBy the value for sys_menu.update_by
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.update_time
     *
     * @return the value of sys_menu.update_time
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.update_time
     *
     * @param updateTime the value for sys_menu.update_time
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Fri Aug 18 15:46:14 GST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", permission=").append(permission);
        sb.append(", icon=").append(icon);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", keepAlive=").append(keepAlive);
        sb.append(", type=").append(type);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}