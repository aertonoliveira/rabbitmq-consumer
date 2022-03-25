package com.studio9.rabbimq.consumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableRabbit
@EnableScheduling
@SpringBootApplication
@ComponentScan("com.studio9.rabbimq")
public class RabbimqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbimqConsumerApplication.class, args);
    }

}
