package com.fei.shop.entities.po;

import java.util.Date;
import javax.persistence.*;

public class Advert {
    @Id
    private Integer id;

    /**
     * 广告标题
     */
    private String name;

    /**
     * 所广告的商品页面或者活动页面链接地址
     */
    private String link;

    /**
     * 广告宣传图片
     */
    private String url;

    /**
     * 活动内容
     */
    private String content;

    /**
     * 广告开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 广告结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 是否启动
     */
    private Boolean enabled;

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
     * 获取广告标题
     *
     * @return name - 广告标题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置广告标题
     *
     * @param name 广告标题
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取所广告的商品页面或者活动页面链接地址
     *
     * @return link - 所广告的商品页面或者活动页面链接地址
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置所广告的商品页面或者活动页面链接地址
     *
     * @param link 所广告的商品页面或者活动页面链接地址
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 获取广告宣传图片
     *
     * @return url - 广告宣传图片
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置广告宣传图片
     *
     * @param url 广告宣传图片
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取活动内容
     *
     * @return content - 活动内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置活动内容
     *
     * @param content 活动内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取广告开始时间
     *
     * @return start_time - 广告开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置广告开始时间
     *
     * @param startTime 广告开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取广告结束时间
     *
     * @return end_time - 广告结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置广告结束时间
     *
     * @param endTime 广告结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取是否启动
     *
     * @return enabled - 是否启动
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启动
     *
     * @param enabled 是否启动
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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