package com.fei.shop.entities.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "admin_notice_reading_records")
public class AdminNoticeReadingRecords {
    @Id
    private Integer id;

    /**
     * 通知ID
     */
    @Column(name = "notice_id")
    private Integer noticeId;

    /**
     * 通知标题
     */
    @Column(name = "notice_title")
    private String noticeTitle;

    /**
     * 接收通知的管理员ID
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 阅读时间，如果是NULL则是未读状态
     */
    @Column(name = "read_time")
    private Date readTime;

    /**
     * 创建时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 逻辑删除
     */
    private Boolean deleted;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取通知ID
     *
     * @return notice_id - 通知ID
     */
    public Integer getNoticeId() {
        return noticeId;
    }

    /**
     * 设置通知ID
     *
     * @param noticeId 通知ID
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    /**
     * 获取通知标题
     *
     * @return notice_title - 通知标题
     */
    public String getNoticeTitle() {
        return noticeTitle;
    }

    /**
     * 设置通知标题
     *
     * @param noticeTitle 通知标题
     */
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    /**
     * 获取接收通知的管理员ID
     *
     * @return admin_id - 接收通知的管理员ID
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置接收通知的管理员ID
     *
     * @param adminId 接收通知的管理员ID
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取阅读时间，如果是NULL则是未读状态
     *
     * @return read_time - 阅读时间，如果是NULL则是未读状态
     */
    public Date getReadTime() {
        return readTime;
    }

    /**
     * 设置阅读时间，如果是NULL则是未读状态
     *
     * @param readTime 阅读时间，如果是NULL则是未读状态
     */
    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    /**
     * 获取创建时间
     *
     * @return add_time - 创建时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置创建时间
     *
     * @param addTime 创建时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取逻辑删除
     *
     * @return deleted - 逻辑删除
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置逻辑删除
     *
     * @param deleted 逻辑删除
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}