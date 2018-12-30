package com.priyam.kafka.spingbootkafkaexample.listener;

import com.priyam.kafka.spingbootkafkaexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "Kafka-Example", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessage(User user) {
        System.out.println("Consumed Message: " + user.toString());
    }
}
