package com.example.reactivekafkaconsumerandproducer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    //@KafkaListener(topics = "demo-topic", groupId = "reactivekafkaconsumerandproducer")
    public void  getMessage(String message){
        System.out.println("I am in the consumer: "+ message);

    }
}
