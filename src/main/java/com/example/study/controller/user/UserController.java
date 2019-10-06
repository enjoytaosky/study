package com.example.study.controller.user;

import com.example.study.bean.common.CommonException;
import com.example.study.bean.vo.user.UserVO;
import com.example.study.service.user.UserService;
import com.example.study.util.RedisUtil;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: taotao
 * @date: 2019/8/30 15:46
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private RedisUtil redisUtill;

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserVO> getUserList() {
        return Lists.newArrayList(UserVO.builder().UserCode("0001").UserName("taotao").build());
    }


    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody UserVO userVO) {
        return "";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public String json() throws Exception {
        userService.getList();
        //throw new CommonException("发生错误2");
        return "";
    }

    @GetMapping("/log")
    public String log() {
      //  userService.getList();
        redisUtill.expire("sss", 100L);
        return "success";
    }

}
