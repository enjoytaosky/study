package com.example.study.bean.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.study.bean.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taotao
 * @date: 2019/10/23 09:49
 * @description:
 */
@Data
@TableName(value = "stud_domain")
public class Domain extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -7494075508475640447L;


    /**
     * 备注
     */
    private String remark;

    /**
     * 域名名称
     */
    private String domainName;
}
