package com.demo.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerDemoTest {

    private final Logger logger = LoggerFactory.getLogger(ConsumerDemoTest.class);

    @KafkaListener(topics = "topic-1", groupId = "group-1")
    public void consume(String message) {
        logger.info(message);
    }

}
