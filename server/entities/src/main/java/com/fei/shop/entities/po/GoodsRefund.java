package com.fei.shop.entities.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "goods_refund")
public class GoodsRefund {
    @Id
    private Integer id;

    /**
     * 售后编号
     */
    @Column(name = "aftersale_sn")
    private String aftersaleSn;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 售后类型，0是未收货退款，1是已收货退款，2用户退货退款
     */
    private Short type;

    /**
     * 退款原因
     */
    private String reason;

    /**
     * 退款金额
     */
    private BigDecimal amount;

    /**
     * 退款凭证图片链接数组
     */
    private String pictures;

    /**
     * 退款说明
     */
    private String comment;

    /**
     * 售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     */
    private Short status;

    /**
     * 管理员操作时间
     */
    @Column(name = "handle_time")
    private Date handleTime;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 售后编号
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
     * 获取售后编号
     *
     * @return aftersale_sn - 售后编号
     */
    public String getAftersaleSn() {
        return aftersaleSn;
    }

    /**
     * 设置售后编号
     *
     * @param aftersaleSn 售后编号
     */
    public void setAftersaleSn(String aftersaleSn) {
        this.aftersaleSn = aftersaleSn == null ? null : aftersaleSn.trim();
    }

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取售后类型，0是未收货退款，1是已收货退款，2用户退货退款
     *
     * @return type - 售后类型，0是未收货退款，1是已收货退款，2用户退货退款
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置售后类型，0是未收货退款，1是已收货退款，2用户退货退款
     *
     * @param type 售后类型，0是未收货退款，1是已收货退款，2用户退货退款
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 获取退款原因
     *
     * @return reason - 退款原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置退款原因
     *
     * @param reason 退款原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取退款金额
     *
     * @return amount - 退款金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置退款金额
     *
     * @param amount 退款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取退款凭证图片链接数组
     *
     * @return pictures - 退款凭证图片链接数组
     */
    public String getPictures() {
        return pictures;
    }

    /**
     * 设置退款凭证图片链接数组
     *
     * @param pictures 退款凭证图片链接数组
     */
    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }

    /**
     * 获取退款说明
     *
     * @return comment - 退款说明
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置退款说明
     *
     * @param comment 退款说明
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * 获取售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     *
     * @return status - 售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     *
     * @param status 售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取管理员操作时间
     *
     * @return handle_time - 管理员操作时间
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * 设置管理员操作时间
     *
     * @param handleTime 管理员操作时间
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
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
     * 获取售后编号
     *
     * @return deleted - 售后编号
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置售后编号
     *
     * @param deleted 售后编号
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}