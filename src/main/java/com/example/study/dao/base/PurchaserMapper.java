package com.example.study.dao.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.study.bean.entity.base.Purchaser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaserMapper extends BaseMapper<Purchaser> {
}
