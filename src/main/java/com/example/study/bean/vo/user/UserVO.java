package com.example.study.bean.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/8/30 15:48
 * @description:
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ApiModel
public class UserVO implements Serializable {
    private static final long serialVersionUID = -1061149592885236736L;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String UserName;

    /**
     * 编码
     */
    @ApiModelProperty(value = "编码")
    private String UserCode;

}
