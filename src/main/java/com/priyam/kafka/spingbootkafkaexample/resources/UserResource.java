package com.priyam.kafka.spingbootkafkaexample.resources;

import com.priyam.kafka.spingbootkafkaexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "Kafka-Example";

    @GetMapping("produce/{value}")
    public String publishMessage(@PathVariable(value = "value") String value) {
        kafkaTemplate.send(TOPIC, new User(value, "Hey There"));
        return "Produced Successfully";
    }
}
