package de.ollie.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

	@KafkaListener(topics = "${spring.kafka.topic-name:blueprint-default-topic}", groupId = "${spring.kafka.group-id:blueprint-default-group}")
	public void listenGroupFoo(String message) {
		System.out.println("received: " + message);
	}

}
