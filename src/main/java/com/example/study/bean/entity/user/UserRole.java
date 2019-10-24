package com.example.study.bean.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 10:06
 * @description:
 */
@Data
@TableName(value = "study_user_role")
public class UserRole extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -3215615324627331058L;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Long roleId;
}
