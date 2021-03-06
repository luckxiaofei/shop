package com.fei.shop.entities.po;

import javax.persistence.*;

@Table(name = "sys_region")
public class SysRegion {
    @Id
    private Integer id;

    /**
     * 行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0
     */
    private Integer pid;

    /**
     * 行政区域名称
     */
    private String name;

    /**
     * 行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县
     */
    private Byte type;

    /**
     * 行政区域编码
     */
    private Integer code;

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
     * 获取行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0
     *
     * @return pid - 行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0
     *
     * @param pid 行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取行政区域名称
     *
     * @return name - 行政区域名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置行政区域名称
     *
     * @param name 行政区域名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县
     *
     * @return type - 行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县
     *
     * @param type 行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取行政区域编码
     *
     * @return code - 行政区域编码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置行政区域编码
     *
     * @param code 行政区域编码
     */
    public void setCode(Integer code) {
        this.code = code;
    }
}