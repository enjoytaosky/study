package com.example.study.bean.dto.base;

import com.example.study.bean.dto.BasePageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 15:02
 * @description: 供应商列表查询入参对象
 */
@Data
@ApiModel(discriminator = "供应商列表查询入参对象")

public class SupplierPageDTO extends BasePageDTO implements Serializable {


    private static final long serialVersionUID = 1452925163417123386L;

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
    private Boolean status;

}
