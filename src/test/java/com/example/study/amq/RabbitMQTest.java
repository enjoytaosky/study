package com.example.study.amq;

import com.example.study.StudyApplicationTests;
import com.example.study.amq.rabbit.producer.RabbitProducer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: taotao
 * @date: 2019/10/21 16:16
 * @description:
 */
public class RabbitMQTest extends StudyApplicationTests {
    @Autowired
    private RabbitProducer producer;

    @Test
    public void testStringSend() {
        for (int i = 0; i < 10; i++) {
            producer.sendStringMessage();
        }
    }

}
