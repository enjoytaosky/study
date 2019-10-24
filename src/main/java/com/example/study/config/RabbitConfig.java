package com.example.study.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: taotao
 * @date: 2019/10/21 15:53
 * @description:
 */
@Configuration
public class RabbitConfig {
    private final static String STRING = "string";


    @Bean
    public Queue string() {
        return new Queue(STRING);
    }

    @Bean
    public Queue fanoutA() {
        return new Queue("fanout.a");
    }


    @Bean
    public Queue fanoutB() {
        return new Queue("fanout.b");
    }


    @Bean
    public Queue fanoutC() {
        return new Queue("fanout.c");
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding bindingExchangeWithA() {
        return BindingBuilder.bind(fanoutA()).to(fanoutExchange());
    }


    @Bean
    public Binding bindingExchangeWithB() {
        return BindingBuilder.bind(fanoutB()).to(fanoutExchange());
    }


    @Bean
    public Binding bindingExchangeWithC() {
        return BindingBuilder.bind(fanoutC()).to(fanoutExchange());
    }


    @Bean
    public Queue topicA() {
        return new Queue("topic.a");
    }

    @Bean
    public Queue topicB() {
        return new Queue("topic.b");
    }

    @Bean
    public Queue topicC() {
        return new Queue("topic.c");
    }

    /**
     * 定义个topic交换器
     *
     * @return
     */
    @Bean
    TopicExchange topicExchange() {
        // 定义一个名为fanoutExchange的fanout交换器
        return new TopicExchange("topicExchange");
    }

    /**
     * 将定义的topicA队列与topicExchange交换机绑定
     *
     * @return
     */
    @Bean
    public Binding bindingTopicExchangeWithA() {
        return BindingBuilder.bind(topicA()).to(topicExchange()).with("topic.msg");
    }

    /**
     * 将定义的topicB队列与topicExchange交换机绑定
     *
     * @return
     */
    @Bean
    public Binding bindingTopicExchangeWithB() {
        return BindingBuilder.bind(topicB()).to(topicExchange()).with("topic.#");
    }

    /**
     * 将定义的topicC队列与topicExchange交换机绑定
     *
     * @return
     */
    @Bean
    public Binding bindingTopicExchangeWithC() {
        return BindingBuilder.bind(topicC()).to(topicExchange()).with("topic.*.z");
    }

}
