package com.example.study.bean.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/8/30 16:49
 * @description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage<T> implements Serializable {
    private static final long serialVersionUID = -7731673586036282829L;

    public static final Integer OK = 0;

    public static final Integer ERROR = 9999;
    /**
     * 结果
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

    /**
     * 对象
     */
    private T date;
}
