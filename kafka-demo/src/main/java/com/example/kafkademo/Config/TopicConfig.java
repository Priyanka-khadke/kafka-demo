package com.example.kafkademo.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {
    @Bean
    public NewTopic createTopic(){
        return new NewTopic("new-test-topic",5,(short)1);
    }

}
