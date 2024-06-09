package com.example.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.kafkademo.service.KafkaPublisher;

@RestController
@RequestMapping("/v1")
public class KafkaController {

    @Autowired
    KafkaPublisher publisher;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> sendingMessage(@PathVariable String message) {
        try {
            for (int i = 0; i < 10000; i++) {
                publisher.sendMessage(message + i);
            }
            return ResponseEntity.ok("message sent successfully!!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}