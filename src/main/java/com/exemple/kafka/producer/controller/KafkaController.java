package com.exemple.kafka.producer.controller;

import com.exemple.kafka.model.Transaction;
import com.exemple.kafka.producer.sender.KafkaSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final KafkaSender kafkaSender;

    KafkaController(KafkaSender kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    @PostMapping(
            consumes = "application/json",
            produces = "application/json"
    )
    public void sendMessage(@RequestBody String message) {
        kafkaSender.sendMessage("topic-1", message);
    }
}
