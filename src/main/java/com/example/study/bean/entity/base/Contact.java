package com.example.study.bean.entity.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/30 14:49
 * @description: 联系方式
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "study_contact")
public class Contact extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -7851531450532922232L;


    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系地址
     */
    private String contactAddress;

    /**
     * 电话
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String email;
}
