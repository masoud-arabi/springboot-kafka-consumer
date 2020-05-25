package com.maosud.springbootkafkaconsumer.listener;

import com.maosud.springbootkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaListener {

    @KafkaListener(topics = "Kafka_Example",groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message:" + message);
    }

    @KafkaListener(topics = "Kafka_Example_json",groupId = "group_json",containerFactory = "kafkaListenerContainerFactory")
    public void jsonConsume(User user){
        System.out.println("Consumed Json :"+user);
    }
}
