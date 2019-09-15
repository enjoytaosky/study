package com.example.study.dao.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    /**
     * 计数
     * @return
     */
    int countUserList();
}
