package com.example.Apache_Activemq.receiver;

import com.example.Apache_Activemq.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@Component
@Slf4j
public class MessageReceiver implements MessageListener {
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    MessageConverter messageConverter;

    public String receiveMessage(){
        try{
//            receive the message
            Message message = jmsTemplate.receive();
            String response = (String) messageConverter.fromMessage(message);
            return response;
        }
        catch(Exception exe){
            exe.printStackTrace();
        }
        return null;
    }

    public Product receiveMessage1(){
        try{
//            receive the message here
            Message message = jmsTemplate.receive();
            Product product = (Product) messageConverter.fromMessage(message);
            return product;
        }
        catch(Exception exe){
            exe.printStackTrace();
        }
        return null;
    }
    public void onMessage(Message message){
        try{
            Product product = (Product) messageConverter.fromMessage(message);
            log.info("*************Inside the message***************");
            log.info(String.valueOf(product));
            log.info("*************Inside the message***************");
        } catch (JMSException ex) {
            ex.printStackTrace();
        }
    }
}
