package com.example.study.service.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.example.study.bean.entity.user.Menu;
import com.example.study.bean.entity.user.UserMenu;
import com.example.study.dao.user.MenuMapper;
import com.example.study.dao.user.UserMenuMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: taotao
 * @date: 2019/10/23 10:46
 * @description:
 */
@Service
@Slf4j
public class MenuService {


    @Autowired
    private UserMenuMapper userMenuMapper;


    @Autowired
    private MenuMapper menuMapper;


    /**
     * 根据用户获取对应的菜单
     *
     * @param userId
     * @return
     */
    public List<Menu> getMenuByUserId(Long userId) {
        List<Menu> resultList = new ArrayList<>();
        QueryWrapper<UserMenu> queryWrapper = new QueryWrapper<>();
        UserMenu menu = new UserMenu();
        menu.setUserId(userId);
        queryWrapper.setEntity(menu);
        List<UserMenu> userMenus = userMenuMapper.selectList(queryWrapper);
        if (CollectionUtils.isNotEmpty(userMenus)) {
            List<Long> idList = userMenus.stream().map(UserMenu::getMenuId).collect(Collectors.toList());
            resultList = menuMapper.selectBatchIds(idList);
        }
        return resultList;
    }
}
