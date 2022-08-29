package com.example.Apache_Activemq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.example")
@Import({MessageConfiguration.class})
public class AppConfig {
}
