package com.example.study.amq.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: taotao
 * @date: 2019/10/22 14:47
 * @description:
 */
@Component
@RabbitListener(queues = "topic.b")
public class TopicBConsumer {


    /**
     * 消息消费
     *
     * @RabbitHandler 代表此方法为接受到消息后的处理方法
     */
    @RabbitHandler
    public void recieved(String msg) {
        System.out.println("[topic.b] " +
                "recieved message:" + msg);
    }
}
