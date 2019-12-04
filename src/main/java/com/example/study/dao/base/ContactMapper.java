package com.example.study.dao.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.study.bean.entity.base.Contact;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: taotao
 * @date: 2019/10/30 14:50
 * @description: 联系方式
 */
@Mapper
public interface ContactMapper extends BaseMapper<Contact> {
}
