package com.example.study.bean.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 09:44
 * @description:
 */
@Data
@TableName("study_role_menu")
public class RoleMenu extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 5289736419601186387L;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 菜单id
     */
    private Long menuId;
}
