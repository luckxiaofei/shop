package com.fei.shop.entities.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_order_goods_detail")
public class UserOrderGoodsDetail {
    @Id
    private Integer id;

    /**
     * 订单表的订单ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 商品表的商品ID
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 商品编号
     */
    @Column(name = "goods_sn")
    private String goodsSn;

    /**
     * 商品货品的购买数量
     */
    private Short number;

    /**
     * 商品货品的售价
     */
    private BigDecimal price;

    /**
     * 商品货品的规格列表
     */
    private String specifications;

    /**
     * 商品货品图片或者商品图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。
     */
    private Integer comment;

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
     * 获取订单表的订单ID
     *
     * @return order_id - 订单表的订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单表的订单ID
     *
     * @param orderId 订单表的订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
     * 获取商品货品的购买数量
     *
     * @return number - 商品货品的购买数量
     */
    public Short getNumber() {
        return number;
    }

    /**
     * 设置商品货品的购买数量
     *
     * @param number 商品货品的购买数量
     */
    public void setNumber(Short number) {
        this.number = number;
    }

    /**
     * 获取商品货品的售价
     *
     * @return price - 商品货品的售价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品货品的售价
     *
     * @param price 商品货品的售价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品货品的规格列表
     *
     * @return specifications - 商品货品的规格列表
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * 设置商品货品的规格列表
     *
     * @param specifications 商品货品的规格列表
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    /**
     * 获取商品货品图片或者商品图片
     *
     * @return pic_url - 商品货品图片或者商品图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置商品货品图片或者商品图片
     *
     * @param picUrl 商品货品图片或者商品图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 获取订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。
     *
     * @return comment - 订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。
     */
    public Integer getComment() {
        return comment;
    }

    /**
     * 设置订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。
     *
     * @param comment 订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。
     */
    public void setComment(Integer comment) {
        this.comment = comment;
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