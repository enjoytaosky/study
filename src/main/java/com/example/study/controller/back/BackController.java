package com.example.study.controller.back;

import com.example.study.amq.rabbit.producer.RabbitProducer;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: taotao
 * @date: 2019/10/22 14:15
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/back")
public class BackController {

    @Autowired
    private RabbitProducer rabbitProducer;

    @ApiOperation(value = "发送消息", notes = "")
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public void sendMessage() {
        //rabbitProducer.sendExchangeMessage();
        rabbitProducer.topicTopic1Send();
        rabbitProducer.topicTopic3Send();
        rabbitProducer.topicTopic2Send();
    }

}
