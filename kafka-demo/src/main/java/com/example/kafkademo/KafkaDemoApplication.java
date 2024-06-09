package com.example.kafkademo;

import com.example.kafkademo.controller.KafkaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.kafkademo.service.KafkaPublisher;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaDemoApplication.class, args);
	}

}
