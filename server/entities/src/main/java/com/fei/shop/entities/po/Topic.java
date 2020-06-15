package com.fei.shop.entities.po;

import java.util.Date;
import javax.persistence.*;

public class Topic {
    @Id
    private Integer id;

    /**
     * 专题标题
     */
    private String title;

    /**
     * 专题子标题
     */
    private String subtitle;

    /**
     * 专题阅读量
     */
    @Column(name = "read_count")
    private String readCount;

    /**
     * 专题图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 排序
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 专题相关商品，采用JSON数组格式
     */
    private String goods;

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
     * 专题内容，富文本格式
     */
    private String content;

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
     * 获取专题标题
     *
     * @return title - 专题标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置专题标题
     *
     * @param title 专题标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取专题子标题
     *
     * @return subtitle - 专题子标题
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * 设置专题子标题
     *
     * @param subtitle 专题子标题
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * 获取专题阅读量
     *
     * @return read_count - 专题阅读量
     */
    public String getReadCount() {
        return readCount;
    }

    /**
     * 设置专题阅读量
     *
     * @param readCount 专题阅读量
     */
    public void setReadCount(String readCount) {
        this.readCount = readCount == null ? null : readCount.trim();
    }

    /**
     * 获取专题图片
     *
     * @return pic_url - 专题图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置专题图片
     *
     * @param picUrl 专题图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 获取排序
     *
     * @return sort_order - 排序
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排序
     *
     * @param sortOrder 排序
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取专题相关商品，采用JSON数组格式
     *
     * @return goods - 专题相关商品，采用JSON数组格式
     */
    public String getGoods() {
        return goods;
    }

    /**
     * 设置专题相关商品，采用JSON数组格式
     *
     * @param goods 专题相关商品，采用JSON数组格式
     */
    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
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

    /**
     * 获取专题内容，富文本格式
     *
     * @return content - 专题内容，富文本格式
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置专题内容，富文本格式
     *
     * @param content 专题内容，富文本格式
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}