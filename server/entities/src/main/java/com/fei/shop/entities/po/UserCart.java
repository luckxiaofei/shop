package com.fei.shop.entities.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_cart")
public class UserCart {
    @Id
    private Integer id;

    /**
     * 用户表的用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 商品表的商品ID
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品编号
     */
    @Column(name = "goods_sn")
    private String goodsSn;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 商品货品的价格
     */
    private BigDecimal price;

    /**
     * 商品货品的数量
     */
    private Short number;

    /**
     * 商品规格id
     */
    @Column(name = "specification_id")
    private Integer specificationId;

    /**
     * 商品规格
     */
    private String specifications;

    /**
     * 购物车中商品是否选择状态
     */
    private Boolean checked;

    /**
     * 商品图片或者商品货品图片
     */
    @Column(name = "pic_url")
    private String picUrl;

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
     * 获取商品表的商品ID
     *
     * @return goods_id - 商品表的商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品表的商品ID
     *
     * @param goodsId 商品表的商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品编号
     *
     * @return goods_sn - 商品编号
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * 设置商品编号
     *
     * @param goodsSn 商品编号
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    /**
     * 获取商品名称
     *
     * @return goods_name - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 获取商品货品的价格
     *
     * @return price - 商品货品的价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品货品的价格
     *
     * @param price 商品货品的价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品货品的数量
     *
     * @return number - 商品货品的数量
     */
    public Short getNumber() {
        return number;
    }

    /**
     * 设置商品货品的数量
     *
     * @param number 商品货品的数量
     */
    public void setNumber(Short number) {
        this.number = number;
    }

    /**
     * 获取商品规格id
     *
     * @return specification_id - 商品规格id
     */
    public Integer getSpecificationId() {
        return specificationId;
    }

    /**
     * 设置商品规格id
     *
     * @param specificationId 商品规格id
     */
    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }

    /**
     * 获取商品规格
     *
     * @return specifications - 商品规格
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * 设置商品规格
     *
     * @param specifications 商品规格
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    /**
     * 获取购物车中商品是否选择状态
     *
     * @return checked - 购物车中商品是否选择状态
     */
    public Boolean getChecked() {
        return checked;
    }

    /**
     * 设置购物车中商品是否选择状态
     *
     * @param checked 购物车中商品是否选择状态
     */
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    /**
     * 获取商品图片或者商品货品图片
     *
     * @return pic_url - 商品图片或者商品货品图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置商品图片或者商品货品图片
     *
     * @param picUrl 商品图片或者商品货品图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
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