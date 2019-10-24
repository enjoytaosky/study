package com.example.study.bean.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: taotao
 * @date: 2019/10/23 09:35
 * @description:
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -9147044312525189806L;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    @TableId
    private Long id;


    @Version
    private Long version;

    /**
     * 域l
     */
    private String domainId;

}
