package com.example.study.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: taotao
 * @date: 2019/10/6 16:24
 * @description: Redis配置值
 */
@Component
@Data
public class RedisProperties {
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.timeout}")
    private int timeout;
    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;
    @Value("${spring.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;
    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.jedis.pool.min-idle}")
    private String minIdle;

    @Value("${spring.redis.jedis.pool.max-active}")
    private String maxActive;

}
