package com.example.study.bean.entity.base;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 13:59
 * @description: 供应商
 */
@Data
@TableName(value = "study_supplier")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Supplier extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 5774941586351477251L;


    /**
     * 供应商编号
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String supplierNo;

    /**
     * 供应商名称
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String supplierName;

    /**
     * 状态
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private Integer status;

    /**
     * 联系方式id
     */
    private Long contactId;
}
