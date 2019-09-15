package com.example.study.service.user;

import com.example.study.dao.user.UserDao;
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
    UserDao userDao;

    public void getList() {
        int i = userDao.countUserList();
        log.info("i:" + i);
    }

}
