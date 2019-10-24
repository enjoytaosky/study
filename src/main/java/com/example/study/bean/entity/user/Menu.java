package com.example.study.bean.entity.user;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

/**
 * @author: taotao
 * @date: 2019/10/23 09:37
 * @description: 菜单
 */
@Data
@TableName(value = "study_menu")
public class Menu extends BaseEntity {

    /**
     * 接口
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String url;

    /**
     * 菜单名称
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String menuName;


}
