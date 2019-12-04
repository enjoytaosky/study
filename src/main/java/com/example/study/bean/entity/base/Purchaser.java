package com.example.study.bean.entity.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 13:55
 * @description: 采购商
 */
@Data
@TableName(value = "study_purchaser")
public class Purchaser extends BaseEntity implements Serializable {

    /**
     * 商户编号
     */
    private String purchaserNo;

    /**
     * 商户名称
     */
    private String purchaserName;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 联系方式id
     */
    private Long contactId;
}
