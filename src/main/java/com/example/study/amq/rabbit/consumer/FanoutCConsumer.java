package com.example.study.amq.rabbit.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: taotao
 * @date: 2019/10/22 14:20
 * @description:
 */
@Component
@Slf4j
@RabbitListener(queues = "fanout.c")
public class FanoutCConsumer {


    /**
     * 消费fanoutC的消息
     */
    @RabbitHandler
    public void consumerFanoutCMessage(String message) {
        log.info("consumerFanoutCMessage start. message:{}", message);
    }
}
