package com.example.study.bean.entity.user;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 09:33
 * @description: 用户，登录的用户
 */
@Data
@TableName("study_user")
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 8416826678428746815L;


    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String name;


    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String passWord;


}
