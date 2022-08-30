package com.example.Apache_Activemq.messages;

import com.example.Apache_Activemq.config.AppConfig;
import com.example.Apache_Activemq.model.Product;
import com.example.Apache_Activemq.producer.MessageSender;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@Slf4j
public class MessageProducerApp {
    public static void mains(String[]args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender =  context.getBean(MessageSender.class);
        messageSender.sendMessage("It is a Monday morning");
        log.info("************The message has been sent successfully************");
        ((AbstractApplicationContext) context).close();
    }
    public static void main(String[]args){
        Gson gson = new Gson();
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = context.getBean(MessageSender.class);

        Product product = new Product();
        product.setProductId(100);
        product.setName("Phone");
        product.setQuantity(10);

        String product1 = gson.toJson(product);

        messageSender.sendMessage1(product1);
        log.info("*********the message has been sent successfully***********");
        log.info("***********The message is: *************"+ product1);
        ((AbstractApplicationContext) context).close();
    }
}
