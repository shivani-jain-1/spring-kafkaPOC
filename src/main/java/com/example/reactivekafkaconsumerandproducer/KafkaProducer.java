package com.example.reactivekafkaconsumerandproducer;

import com.example.reactivekafkaconsumerandproducer.service.ReactiveProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
    private static final String TOPIC="demo-topic";
    @Autowired
    private KafkaTemplate<String ,String> kafkaTemplate;

    public void writeMessage(String msg){
        log.info("write message to topic");
        this.kafkaTemplate.send(TOPIC,msg);
    }

}
