package com.example.Apache_Activemq.messages;

import com.example.Apache_Activemq.config.AppConfig;
import com.example.Apache_Activemq.producer.MessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@Slf4j
public class MessageProducerApp {
    public static  void main(String[]args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender =  context.getBean(MessageSender.class);
        messageSender.sendMessage("It is a Monday morning");
        log.info("************The message has been sent successfully************");
        ((AbstractApplicationContext) context).close();
    }
}
