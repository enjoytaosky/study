package com.example.study.bean.entity.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 14:03
 * @description: 商品
 */
@Data
@TableName(value = "study_sku")
public class Sku extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8764423151217350511L;
    /**
     * 商品编号
     */
    private String skuNo;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 单位id
     */
    private Long unitId;

    /**
     * 类目id
     */
    private Long categoryId;
}
