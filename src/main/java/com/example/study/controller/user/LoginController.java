package com.example.study.controller.user;

import com.example.study.bean.entity.user.User;
import com.example.study.bean.request.LoginRequest;
import com.example.study.bean.response.BaseResponse;
import com.example.study.util.SecurityUtils;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: taotao
 * @date: 2019/10/23 11:27
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class LoginController {


    @Autowired
    private AuthenticationManager authenticationManager;

    @ApiOperation(value = "登录", notes = "")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(@RequestBody LoginRequest requestBody, HttpServletRequest request) {

        User user = new User();
        String userName = requestBody.getUserName();
        String passWord = requestBody.getPassWord();


        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(passWord, userName);

        //SpringSecurity进行认证和授权
        Authentication authenticate = authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        HttpSession session = request.getSession();
        //// 这个非常重要，否则验证后将无法登陆
        session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext());

        return "redirect:index";
    }

    @ApiOperation(value = "登出", notes = "")
    @RequestMapping(value = "/loginOut", method = RequestMethod.POST)
    public BaseResponse<String> userLoginOut(@RequestBody LoginRequest requestBody, HttpServletRequest request) {
        SecurityUtils.logout();
        return new BaseResponse<String>(true, "success", 200, "success");
    }

}
