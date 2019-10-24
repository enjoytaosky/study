package com.example.study.amq.rabbit.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: taotao
 * @date: 2019/10/21 16:05
 * @description: 生产者
 */
@Component
@Slf4j
public class RabbitProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void sendStringMessage() {
        log.info("send String message start.");
        Date date = new Date();
        String dateString = new SimpleDateFormat("YYYY-mm-DD hh:MM:ss").format(date);
        rabbitTemplate.convertAndSend("string", dateString);
        log.info("send String message end.");

    }


    public void sendExchangeMessage() {
        log.info("send exchangeMessage start.");
        Date date = new Date();
        String dateString = new SimpleDateFormat("YYYY-mm-DD hh:MM:ss").format(date);
        rabbitTemplate.convertAndSend("fanoutExchange", "", dateString);
    }


    public void topicTopic1Send() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("YYYY-mm-DD hh:MM:ss").format(date);
        dateString = "[topic.msg] send msg:" + dateString;
        System.out.println(dateString);
        // 注意 第一个参数是我们交换机的名称 ，第二个参数是routerKey topic.msg，第三个是你要发送的消息
        // 这条信息将会被 topic.a  topic.b接收
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.msg", dateString);
    }


    public void topicTopic2Send() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("YYYY-mm-DD hh:MM:ss").format(date);
        dateString = "[topic.good.msg] send msg:" + dateString;
        System.out.println(dateString);
        // 注意 第一个参数是我们交换机的名称 ，第二个参数是routerKey topic.msg，第三个是你要发送的消息
        // 这条信息将会被 topic.a  topic.b接收
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.good.message", dateString);
    }


    public void topicTopic3Send() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("YYYY-mm-DD hh:MM:ss").format(date);
        dateString = "[topic.g.z] send msg:" + dateString;
        System.out.println(dateString);
        // 注意 第一个参数是我们交换机的名称 ，第二个参数是routerKey topic.msg，第三个是你要发送的消息
        // 这条信息将会被 topic.a  topic.b接收
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.g.z", dateString);
    }

}
