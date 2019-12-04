package com.example.study.bean.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 15:02
 * @description:
 */
@Data
@ApiModel
public class BasePageDTO extends BaseDTO implements Serializable {

    /**
     * 页码
     */
    @ApiModelProperty(name = "页码")
    private Integer pageNo;


    /**
     * 分页大小
     */
    @ApiModelProperty(name = "分页大小")
    private Integer pageSize;

}
