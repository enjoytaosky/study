package com.example.study.service.user;

import com.example.study.bean.entity.user.Menu;
import com.example.study.bean.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: taotao
 * @date: 2019/10/22 17:20
 * @description: 用户登录实现累
 */
@Service
public class UserAuthService implements UserDetailsService {

    @Autowired
    private UserService userService;


    @Autowired
    private MenuService menuService;

    /**
     * 根据用户名称加载用户信息
     *
     * @param s
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User userByName = userService.getUserByName(s);
        if (userByName == null) {
            throw new UsernameNotFoundException(s + ",账号不存在");
        }
        List<Menu> menus = menuService.getMenuByUserId(userByName.getId());
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Menu item : menus) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(item.getUrl());
            //此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
            grantedAuthorities.add(grantedAuthority);
        }
        org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails
                .User(userByName.getName(), new BCryptPasswordEncoder().encode(userByName.getPassWord()),
                grantedAuthorities);
        return user;
    }
}
