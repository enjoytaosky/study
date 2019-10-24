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
@RabbitListener(queues = "fanout.a")
public class FanoutAConsumer {


    /**
     * 消费fanoutA的消息
     */
    @RabbitHandler
    public void consumerFanoutAMessage(String message) {
        log.info("consumerFanoutAMessage start. message:{}", message);
    }
}
