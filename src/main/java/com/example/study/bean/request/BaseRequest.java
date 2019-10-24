package com.example.study.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 16:11
 * @description:
 */
@ApiModel
@Data
public class BaseRequest implements Serializable {

    @ApiModelProperty(name = "domainId")
    private String domainId;
}
