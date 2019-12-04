package com.example.study.bean.entity.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 14:06
 * @description: 商品单位
 */

@Data
@TableName(value = "")
public class SkuUnit extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -5673406138265407723L;


    /**
     * 单位编号
     */
    private String unitNo;

    /**
     * 基本单位名称
     */
    private String baseName;

    /**
     * 单位名称
     */
    private String mainName;

}
