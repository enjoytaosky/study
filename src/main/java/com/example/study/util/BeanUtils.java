package com.example.study.util;

import cn.hutool.core.bean.BeanUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: taotao
 * @date: 2019/10/30 15:25
 * @description:
 */
public class BeanUtils extends BeanUtil {


    public static <T> T copy(Object source, Class<T> target) {
        try {
            T t = target.newInstance();
            copyProperties(source, t);
            return t;
        } catch (InstantiationException var3) {
            var3.printStackTrace();
        } catch (IllegalAccessException var4) {
            var4.printStackTrace();
        }

        return null;
    }


    public static <T> List<T> copyList(List<? extends Object> sources, Class<T> target) {
        if (sources != null && !sources.isEmpty()) {
            List<T> beanList = new ArrayList();
            Iterator var3 = sources.iterator();

            while (var3.hasNext()) {
                Object source = var3.next();
                beanList.add(copy(source, target));
            }

            return beanList;
        } else {
            return null;
        }
    }
}
