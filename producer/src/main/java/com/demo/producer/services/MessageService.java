package com.demo.producer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class MessageService {

    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage() {
//        logger.info("Message -> {}", message);
//        this.kafkaTemplate.send("topic-1", message);
        IntStream.range(1, 20)
                .boxed()
                .forEach(n -> this.kafkaTemplate.send("topic-1", "Nº de partição: " + n));
    }

}
