package com.example.study.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 16:09
 * @description:
 */
@Data
@ApiModel(value = "登录请求入参")
public class LoginRequest implements Serializable {
    private static final long serialVersionUID = -2374024521826896664L;


    @ApiModelProperty(name = "用户名")
    private String userName;

    @ApiModelProperty(name = "密码")
    private String passWord;
}
