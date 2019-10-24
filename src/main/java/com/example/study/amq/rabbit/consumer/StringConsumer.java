package com.example.study.amq.rabbit.consumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: taotao
 * @date: 2019/10/21 16:11
 * @description: string 消费者
 */
@Component
@RabbitListener(queues = "string")
public class StringConsumer {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;


    @RabbitHandler
    public void recievedString(String msg) {
        System.out.println("[string] recieved message:" + msg);
    }

}
