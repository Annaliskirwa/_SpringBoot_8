package com.example.Apache_Activemq.messages;

import com.example.Apache_Activemq.config.AppConfig;
import com.example.Apache_Activemq.model.Product;
import com.example.Apache_Activemq.receiver.MessageReceiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@Slf4j
public class MessageConsumerApp {
    public static void mains(String[]args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
        String response = messageReceiver.receiveMessage();
        log.info("**********The message has been received************" + response);
        ((AbstractApplicationContext) context).close();

    }
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
        Product product = messageReceiver.receiveMessage1();
       log.info("Message Received = " + product);

        ((AbstractApplicationContext) context).close();
    }


}
