package com.example.reactivekafkaconsumerandproducer.controller;

import com.example.reactivekafkaconsumerandproducer.dto.FakeProducerDTO;
import com.example.reactivekafkaconsumerandproducer.service.ReactiveProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReactiveKafkaController {
    private final Logger log = LoggerFactory.getLogger(ReactiveKafkaController.class);
    private final com.example.reactivekafkaconsumerandproducer.service.ReactiveProducerService producer;

    public ReactiveKafkaController(ReactiveProducerService producer) {
        this.producer = producer;
    }

    @GetMapping("/reactive-publish")
    public void writeMessageToTopic(@RequestParam String id){
        log.info("in reactive controller...");
        //FakeProducerDTO dto = new FakeProducerDTO(id);

        this.producer.send(id);
    }

}
