package com.example.kafka.service;

import com.example.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, Course> kafkaTemplate;

    public String sendMessage(Course course) {
        kafkaTemplate.send("telusko", "course", course);
        return "Course message is sent to kafka";
    }
}
