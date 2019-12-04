package com.example.study.bean.entity.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: taotao
 * @date: 2019/10/30 14:04
 * @description:商品进出价格
 */
@Data
@TableName(value = "study_sku_price")
public class SkuPrice extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -8448600073701072810L;

    /**
     * 商品进价
     */
    private BigDecimal inPrice;

    /**
     * 商品卖价
     */
    private BigDecimal outPrice;

    /**
     * 安全库存
     */
    private Integer safeStock;

}
