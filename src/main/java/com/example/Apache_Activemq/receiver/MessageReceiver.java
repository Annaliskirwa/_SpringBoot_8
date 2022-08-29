package com.example.Apache_Activemq.receiver;

import com.example.Apache_Activemq.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class MessageReceiver {
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
}
