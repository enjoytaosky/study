package com.example.study.bean.entity.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 14:08
 * @description:商品详情
 */
@Data
@TableName(value = "study_sku_detail")
public class SkuDetail extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -4677433933044501359L;


    /**
     * 颜色
     */
    private String color;

    /**
     * 规格
     */
    private String specs;

    /**
     * 制作商
     */
    private String producer;

    /**
     * 自定义其他字段
     */
    private String udf;
}
