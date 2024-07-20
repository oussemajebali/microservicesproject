package com.example.event.service;

import com.example.event.dto.UserEventDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "user-events", groupId = "group_id")
    public void consume(UserEventDTO message) {
        // Handle the message
    }
}
