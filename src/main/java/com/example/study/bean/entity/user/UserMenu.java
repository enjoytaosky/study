package com.example.study.bean.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 09:58
 * @description:
 */
@Data
@TableName(value = "study_user_menu")
public class UserMenu extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -4494395752301328529L;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 菜单id
     */
    private Long menuId;
}
