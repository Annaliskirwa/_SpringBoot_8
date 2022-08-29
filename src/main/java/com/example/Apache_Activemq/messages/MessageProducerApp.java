package com.example.Apache_Activemq.messages;

import com.example.Apache_Activemq.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MessageProducerApp {
    public static  void main(String[]args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
