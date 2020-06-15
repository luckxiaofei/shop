package com.fei.shop.entities.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_order")
public class UserOrder {
    @Id
    private Integer id;

    /**
     * 用户表的用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 订单编号
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private Short orderStatus;

    /**
     * 售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     */
    @Column(name = "aftersale_status")
    private Short aftersaleStatus;

    /**
     * 收货人名称
     */
    private String consignee;

    /**
     * 收货人手机号
     */
    private String mobile;

    /**
     * 收货具体地址
     */
    private String address;

    /**
     * 用户订单留言
     */
    private String message;

    /**
     * 商品总费用
     */
    @Column(name = "goods_price")
    private BigDecimal goodsPrice;

    /**
     * 配送费用
     */
    @Column(name = "freight_price")
    private BigDecimal freightPrice;

    /**
     * 优惠券减免
     */
    @Column(name = "coupon_price")
    private BigDecimal couponPrice;

    /**
     * 订单费用， = goods_price + freight_price - coupon_price
     */
    @Column(name = "order_price")
    private BigDecimal orderPrice;

    /**
     * 实付费用， = order_price - integral_price
     */
    @Column(name = "actual_price")
    private BigDecimal actualPrice;

    /**
     * 微信付款编号
     */
    @Column(name = "pay_id")
    private String payId;

    /**
     * 微信付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 发货编号
     */
    @Column(name = "ship_sn")
    private String shipSn;

    /**
     * 发货快递公司
     */
    @Column(name = "ship_channel")
    private String shipChannel;

    /**
     * 发货开始时间
     */
    @Column(name = "ship_time")
    private Date shipTime;

    /**
     * 用户确认收货时间
     */
    @Column(name = "confirm_time")
    private Date confirmTime;

    /**
     * 订单关闭时间
     */
    @Column(name = "end_time")
    private Date endTime;

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
     * 获取订单编号
     *
     * @return order_sn - 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号
     *
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     *
     * @return aftersale_status - 售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     */
    public Short getAftersaleStatus() {
        return aftersaleStatus;
    }

    /**
     * 设置售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     *
     * @param aftersaleStatus 售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     */
    public void setAftersaleStatus(Short aftersaleStatus) {
        this.aftersaleStatus = aftersaleStatus;
    }

    /**
     * 获取收货人名称
     *
     * @return consignee - 收货人名称
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收货人名称
     *
     * @param consignee 收货人名称
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * 获取收货人手机号
     *
     * @return mobile - 收货人手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置收货人手机号
     *
     * @param mobile 收货人手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取收货具体地址
     *
     * @return address - 收货具体地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收货具体地址
     *
     * @param address 收货具体地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取用户订单留言
     *
     * @return message - 用户订单留言
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置用户订单留言
     *
     * @param message 用户订单留言
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 获取商品总费用
     *
     * @return goods_price - 商品总费用
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * 设置商品总费用
     *
     * @param goodsPrice 商品总费用
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * 获取配送费用
     *
     * @return freight_price - 配送费用
     */
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    /**
     * 设置配送费用
     *
     * @param freightPrice 配送费用
     */
    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    /**
     * 获取优惠券减免
     *
     * @return coupon_price - 优惠券减免
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * 设置优惠券减免
     *
     * @param couponPrice 优惠券减免
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * 获取订单费用， = goods_price + freight_price - coupon_price
     *
     * @return order_price - 订单费用， = goods_price + freight_price - coupon_price
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * 设置订单费用， = goods_price + freight_price - coupon_price
     *
     * @param orderPrice 订单费用， = goods_price + freight_price - coupon_price
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 获取实付费用， = order_price - integral_price
     *
     * @return actual_price - 实付费用， = order_price - integral_price
     */
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    /**
     * 设置实付费用， = order_price - integral_price
     *
     * @param actualPrice 实付费用， = order_price - integral_price
     */
    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * 获取微信付款编号
     *
     * @return pay_id - 微信付款编号
     */
    public String getPayId() {
        return payId;
    }

    /**
     * 设置微信付款编号
     *
     * @param payId 微信付款编号
     */
    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    /**
     * 获取微信付款时间
     *
     * @return pay_time - 微信付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置微信付款时间
     *
     * @param payTime 微信付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取发货编号
     *
     * @return ship_sn - 发货编号
     */
    public String getShipSn() {
        return shipSn;
    }

    /**
     * 设置发货编号
     *
     * @param shipSn 发货编号
     */
    public void setShipSn(String shipSn) {
        this.shipSn = shipSn == null ? null : shipSn.trim();
    }

    /**
     * 获取发货快递公司
     *
     * @return ship_channel - 发货快递公司
     */
    public String getShipChannel() {
        return shipChannel;
    }

    /**
     * 设置发货快递公司
     *
     * @param shipChannel 发货快递公司
     */
    public void setShipChannel(String shipChannel) {
        this.shipChannel = shipChannel == null ? null : shipChannel.trim();
    }

    /**
     * 获取发货开始时间
     *
     * @return ship_time - 发货开始时间
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * 设置发货开始时间
     *
     * @param shipTime 发货开始时间
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * 获取用户确认收货时间
     *
     * @return confirm_time - 用户确认收货时间
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * 设置用户确认收货时间
     *
     * @param confirmTime 用户确认收货时间
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * 获取订单关闭时间
     *
     * @return end_time - 订单关闭时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置订单关闭时间
     *
     * @param endTime 订单关闭时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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