package com.example.Apache_Activemq.jms;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

@Slf4j
//Class used to receive the message from the queue
public class MessageReceiver {
//    url of the jms server: default broker URL is : tcp://localhost:61616
    public static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
//    name of the queue to receive messages from
    public static String queueName = "MESSAGE_QUEUE";

    public static void main(String[]args) throws JMSException{
        log.info("*************the url is*********** :"+url);

//        get the jms connection form the server and starting it
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

//
    }
}
