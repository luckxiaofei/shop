package com.fei.shop.entities.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "goods_comment")
public class GoodsComment {
    @Id
    private Integer id;

    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 管理员回复内容
     */
    @Column(name = "admin_content")
    private String adminContent;

    /**
     * 用户表的用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 是否含有图片
     */
    @Column(name = "has_picture")
    private Boolean hasPicture;

    /**
     * 图片地址列表，采用JSON数组格式
     */
    @Column(name = "pic_urls")
    private String picUrls;

    /**
     * 评分， 1-5
     */
    private Short star;

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
     * 获取商品ID
     *
     * @return goods_id - 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品ID
     *
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取管理员回复内容
     *
     * @return admin_content - 管理员回复内容
     */
    public String getAdminContent() {
        return adminContent;
    }

    /**
     * 设置管理员回复内容
     *
     * @param adminContent 管理员回复内容
     */
    public void setAdminContent(String adminContent) {
        this.adminContent = adminContent == null ? null : adminContent.trim();
    }

    /**
     * 获取用户表的用户ID
     *
     * @return user_id - 用户表的用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户表的用户ID
     *
     * @param userId 用户表的用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取是否含有图片
     *
     * @return has_picture - 是否含有图片
     */
    public Boolean getHasPicture() {
        return hasPicture;
    }

    /**
     * 设置是否含有图片
     *
     * @param hasPicture 是否含有图片
     */
    public void setHasPicture(Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    /**
     * 获取图片地址列表，采用JSON数组格式
     *
     * @return pic_urls - 图片地址列表，采用JSON数组格式
     */
    public String getPicUrls() {
        return picUrls;
    }

    /**
     * 设置图片地址列表，采用JSON数组格式
     *
     * @param picUrls 图片地址列表，采用JSON数组格式
     */
    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls == null ? null : picUrls.trim();
    }

    /**
     * 获取评分， 1-5
     *
     * @return star - 评分， 1-5
     */
    public Short getStar() {
        return star;
    }

    /**
     * 设置评分， 1-5
     *
     * @param star 评分， 1-5
     */
    public void setStar(Short star) {
        this.star = star;
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