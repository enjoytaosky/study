package com.example.study.bean.dto.base;

import com.example.study.bean.dto.BasePageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 14:31
 * @description: 供应商入参对象
 */
@ApiModel(discriminator = "供应商入参对象")
@Data
public class SupplierDTO extends BasePageDTO implements Serializable {
    private static final long serialVersionUID = 2285652261369903450L;


    /**
     * 供应商编号
     */
    @ApiModelProperty(name = "供应商编号")
    private String supplierNo;

    /**
     * 供应商名称
     */
    @ApiModelProperty(name = "供应商名称")
    private String supplierName;

    /**
     * 状态
     */
    @ApiModelProperty(name = "状态")
    private Integer status;

    /**
     * 联系人
     */
    @ApiModelProperty(name = "联系人")
    private String contactName;

    /**
     * 联系电话
     */
    @ApiModelProperty(name = "联系电话")
    private String contactPhone;


    /**
     * 联系地址
     */
    @ApiModelProperty(name = "联系地址")
    private String contactAddress;

    /**
     * 联系email
     */
    @ApiModelProperty(name = "联系email")
    private String contactEmail;

}
