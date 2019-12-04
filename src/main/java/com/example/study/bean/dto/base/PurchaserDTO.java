package com.example.study.bean.dto.base;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 14:31
 * @description: 采购商入参对象
 */
@ApiModel
@Data
public class PurchaserDTO implements Serializable {
    private static final long serialVersionUID = 2285652261369903450L;


    /**
     * 采购商编号
     */
    private String purchaserNo;

    /**
     * 采购商名称
     */
    private String purchaserName;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系电话
     */
    private String contactPhone;


    /**
     * 联系地址
     */
    private String contactAddress;

}
