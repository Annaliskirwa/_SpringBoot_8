package com.example.Apache_Activemq.jms;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

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

//        Create a session to receive the messages
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

//        Destination which is the MESSAGE_QUEUE
        Destination destination = session.createQueue(queueName);

//        Message consumer for receiving messages
        MessageConsumer consumer = session.createConsumer(destination);

//        Receive the message
        Message message = consumer.receive();

        if (message instanceof TextMessage){
            TextMessage textMessage = (TextMessage) message;
            log.info("*********Received the text message from queue*********" + textMessage.getText());
        }
        connection.close();
    }
}
