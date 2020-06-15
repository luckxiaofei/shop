package com.fei.shop.entities.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * admin_notice
 *
 * @author
 */
@Table(name = "admin_notice")
@Data
public class SysStorage implements Serializable {
    @Id
    private Integer id;
    private String key;
    private String name;
    private String type;
    private long size;
    private String url;
    private Date addTime;
    private Date updateTime;
    private long deleted;

    private static final long serialVersionUID = 1L;
}
