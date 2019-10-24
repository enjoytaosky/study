package com.example.study.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.study.bean.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: taotao
 * @date: 2019/10/23 10:11
 * @description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
