package com.example.study.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.study.bean.entity.user.Menu;
import com.example.study.bean.entity.user.UserMenu;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: taotao
 * @date: 2019/10/23 10:47
 * @description:
 */
@Mapper
public interface UserMenuMapper extends BaseMapper<UserMenu> {
}
