package com.example.user.service;

import com.example.user.dto.UserEventDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, UserEventDTO> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, UserEventDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, UserEventDTO message) {
        kafkaTemplate.send(topic, message);
    }
}
