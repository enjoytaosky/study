package com.example.study.dao.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.study.bean.entity.base.Supplier;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: taotao
 * @date: 2019/10/30 14:19
 * @description:
 */
@Mapper
public interface SupplierMapper extends BaseMapper<Supplier> {
}
