package com.example.study.bean.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: taotao
 * @date: 2019/10/30 15:05
 * @description:
 */
@Data
public class BaseVO implements Serializable {
    private static final long serialVersionUID = 6914794569490686248L;


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
     * 域id
     */
    private String domainId;
}
