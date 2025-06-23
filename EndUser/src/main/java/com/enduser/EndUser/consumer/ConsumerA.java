package com.enduser.EndUser.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class ConsumerA {

    @KafkaListener(topics = "update-location", topicPartitions = @TopicPartition(topic = "updated-location", partitions = {"1"}),groupId = "1")
    public void updatedLocation(String location) {
        System.out.println("partition-1" +location);
    }
}
