package com.example.study.bean.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 09:56
 * @description:
 */
@Data
@TableName(value = "studu_role")
public class Role extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -3160238104302835225L;


    private String roleName;

}
