package com.example.Apache_Activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

@Component
public class MessageSender
{

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final String message)
    {

        jmsTemplate.send(new MessageCreator()
        {
            public Message createMessage(Session session) throws JMSException
            {
                ObjectMessage objectMessage = session.createObjectMessage(message);
                return objectMessage;
            }
        });
    }
    public void sendMessage1(final String product){
        jmsTemplate.send(new MessageCreator() {
        public Message createMessage(Session session) throws  JMSException{
            ObjectMessage objectMessage =  session.createObjectMessage(product);
            return objectMessage;
        }
        });
    }
}