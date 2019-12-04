package com.example.study.bean.response;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/24 10:45
 * @description: 返回对象
 */
@ApiModel
@Data
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 3469010730894991485L;

    private static final Integer success_code = 200;

    /**
     * 成功失败
     */
    private boolean success;

    /**
     * 失败信息
     */
    private String message;


    /**
     * 返回code
     */
    private Integer code;

    /**
     * 返回数据
     */
    private T result;

    public BaseResponse() {
        this.success = true;
        this.message = "成功";
        this.code = success_code;
    }
}
