package com.example.Apache_Activemq.jms;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

@Slf4j
//Class used to send a message to queue
public class MessageSender {
//    url of the jms server: default broker url is tcp://localhost:61616
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
//Queue name
    private static String queueName = "MESSAGE_QUEUE";

    public static void main(String[]args) throws JMSException{
        log.info("**********url**********" + url);
//        Get the JMS connection from the jms server and starting it
        ConnectionFactory connectionFactory =  new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();
    }
}
