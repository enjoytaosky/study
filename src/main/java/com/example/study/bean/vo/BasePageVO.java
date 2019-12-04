package com.example.study.bean.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: taotao
 * @date: 2019/10/30 15:07
 * @description:
 */

@Data
public class BasePageVO<T> implements Serializable {
    private static final long serialVersionUID = -1648636495272561265L;

    private Integer pageNo;


    private Integer pageSize;


    private Long total;

    /**
     * 数据列表
     */
    private List<T> list;
}
