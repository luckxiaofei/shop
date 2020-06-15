package com.fei.shop.entities.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "goods_coupon")
public class GoodsCoupon {
    @Id
    private Integer id;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 优惠券介绍，通常是显示优惠券使用限制文字
     */
    private String desc;

    /**
     * 优惠券标签，例如新人专用
     */
    private String tag;

    /**
     * 优惠券数量，如果是-1，则是无限量
     */
    private Integer total;

    /**
     * 优惠金额，
     */
    private BigDecimal discount;

    /**
     * 最少消费金额才能使用优惠券。
     */
    private BigDecimal min;

    /**
     * 用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.
     */
    private Short limit;

    /**
     * 优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；
     */
    private Short type;

    /**
     * 优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。
     */
    private Short status;

    /**
     * 商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。
     */
    @Column(name = "goods_type")
    private Short goodsType;

    /**
     * 商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。
     */
    @Column(name = "goods_value")
    private String goodsValue;

    /**
     * 优惠券兑换码
     */
    private String code;

    /**
     * 有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；
     */
    @Column(name = "time_type")
    private Short timeType;

    /**
     * 基于领取时间的有效天数days。
     */
    private Short days;

    /**
     * 使用券开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 使用券截至时间
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
     * 获取优惠券名称
     *
     * @return name - 优惠券名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置优惠券名称
     *
     * @param name 优惠券名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取优惠券介绍，通常是显示优惠券使用限制文字
     *
     * @return desc - 优惠券介绍，通常是显示优惠券使用限制文字
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置优惠券介绍，通常是显示优惠券使用限制文字
     *
     * @param desc 优惠券介绍，通常是显示优惠券使用限制文字
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取优惠券标签，例如新人专用
     *
     * @return tag - 优惠券标签，例如新人专用
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置优惠券标签，例如新人专用
     *
     * @param tag 优惠券标签，例如新人专用
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * 获取优惠券数量，如果是-1，则是无限量
     *
     * @return total - 优惠券数量，如果是-1，则是无限量
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 设置优惠券数量，如果是-1，则是无限量
     *
     * @param total 优惠券数量，如果是-1，则是无限量
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 获取优惠金额，
     *
     * @return discount - 优惠金额，
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置优惠金额，
     *
     * @param discount 优惠金额，
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取最少消费金额才能使用优惠券。
     *
     * @return min - 最少消费金额才能使用优惠券。
     */
    public BigDecimal getMin() {
        return min;
    }

    /**
     * 设置最少消费金额才能使用优惠券。
     *
     * @param min 最少消费金额才能使用优惠券。
     */
    public void setMin(BigDecimal min) {
        this.min = min;
    }

    /**
     * 获取用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.
     *
     * @return limit - 用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.
     */
    public Short getLimit() {
        return limit;
    }

    /**
     * 设置用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.
     *
     * @param limit 用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.
     */
    public void setLimit(Short limit) {
        this.limit = limit;
    }

    /**
     * 获取优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；
     *
     * @return type - 优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；
     *
     * @param type 优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 获取优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。
     *
     * @return status - 优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。
     *
     * @param status 优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。
     *
     * @return goods_type - 商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。
     */
    public Short getGoodsType() {
        return goodsType;
    }

    /**
     * 设置商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。
     *
     * @param goodsType 商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。
     */
    public void setGoodsType(Short goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 获取商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。
     *
     * @return goods_value - 商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。
     */
    public String getGoodsValue() {
        return goodsValue;
    }

    /**
     * 设置商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。
     *
     * @param goodsValue 商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。
     */
    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue == null ? null : goodsValue.trim();
    }

    /**
     * 获取优惠券兑换码
     *
     * @return code - 优惠券兑换码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置优惠券兑换码
     *
     * @param code 优惠券兑换码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；
     *
     * @return time_type - 有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；
     */
    public Short getTimeType() {
        return timeType;
    }

    /**
     * 设置有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；
     *
     * @param timeType 有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；
     */
    public void setTimeType(Short timeType) {
        this.timeType = timeType;
    }

    /**
     * 获取基于领取时间的有效天数days。
     *
     * @return days - 基于领取时间的有效天数days。
     */
    public Short getDays() {
        return days;
    }

    /**
     * 设置基于领取时间的有效天数days。
     *
     * @param days 基于领取时间的有效天数days。
     */
    public void setDays(Short days) {
        this.days = days;
    }

    /**
     * 获取使用券开始时间
     *
     * @return start_time - 使用券开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置使用券开始时间
     *
     * @param startTime 使用券开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取使用券截至时间
     *
     * @return end_time - 使用券截至时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置使用券截至时间
     *
     * @param endTime 使用券截至时间
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