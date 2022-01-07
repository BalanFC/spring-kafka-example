package com.demo.consumer2.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerDemoTest2 {

    private final Logger logger = LoggerFactory.getLogger(ConsumerDemoTest2.class);

    @KafkaListener(topics = "topic-1", groupId = "group-2")
    public void consume(String message) {
        logger.info(message);
    }

}
