package com.example.Apache_Activemq.config;

import com.example.Apache_Activemq.receiver.MessageReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
    private static final String DEFAULT_BROKER_URL = "tcp://localhost:61616";
    private static final String MESSAGE_QUEUE = "message_queue";

    @Autowired
    MessageReceiver messageReceiver;
}
