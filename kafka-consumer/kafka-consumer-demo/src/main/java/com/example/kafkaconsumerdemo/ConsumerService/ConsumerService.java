package com.example.kafkaconsumerdemo.ConsumerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    Logger log = LoggerFactory.getLogger(ConsumerService.class);
    @KafkaListener(topics = "new-test-topic",groupId = "new-test-grp-1")
    public void consumeMessage(String message){
        log.info("Recieved message from topic: "+message);




    }
}
