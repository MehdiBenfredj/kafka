package com.exemple.kafka.consumer.listener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListenerExemple {

    @KafkaListener(topics = "topic-1", groupId = "group1")
    public void listen(String data) {
        log.info("Received message : {} in group 1", data);
        log.info("----------------------------------");
    }
}


