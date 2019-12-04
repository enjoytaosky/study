package com.example.study.service.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.study.bean.entity.user.User;
import com.example.study.dao.user.UserDao;
import com.example.study.dao.user.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: taotao
 * @date: 2019/9/3 16:25
 * @description:
 */
@Service
@Slf4j
public class UserService {


    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名称获取用户的信息
     * @param userName
     * @return
     */
    public User getUserByName(String userName) {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        User user = new User();
        user.setName(userName);
        queryWrapper.setEntity(user);
        User userInDB = userMapper.selectOne(queryWrapper);
        return userInDB;
    }

}
