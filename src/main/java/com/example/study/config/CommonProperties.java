package com.example.study.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: taotao
 * @date: 2019/8/30 15:08
 * @description:
 */
@Component
@Data
public class CommonProperties {

    @Value("${com.example.study.name}")
    private String name;

}
