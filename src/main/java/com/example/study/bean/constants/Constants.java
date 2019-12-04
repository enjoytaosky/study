package com.example.study.bean.constants;

/**
 * 常量
 */
public interface Constants {

    /**
     * 数据库中的数据状态；
     * 1：启用；
     * 2：停用；
     */
    Integer STATUS_ENABLE = 1;

    Integer STATUS_UN_ENABLE = 2;

    /**
     * 数据库中的软删除标示
     * 1:删除；
     * 0：未删除；
     */
    Integer DEL_FLAG_YES = 1;

    Integer DEL_FLAG_NO = 0;

}
