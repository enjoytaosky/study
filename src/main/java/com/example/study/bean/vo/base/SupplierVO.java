package com.example.study.bean.vo.base;

import com.example.study.bean.vo.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: taotao
 * @date: 2019/10/30 15:05
 * @description:
 */
@ApiModel
@Data
public class SupplierVO extends BaseVO {

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
     * 联系地址
     */
    @ApiModelProperty(name = "联系地址")
    private String contactAddress;

    /**
     * 电话
     */
    @ApiModelProperty(name = "电话")
    private String phone;

    /**
     * 电子邮箱
     */
    @ApiModelProperty(name = "电子邮箱")
    private String email;
}
