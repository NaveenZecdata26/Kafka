package com.enduser.EndUser.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;

public class ConsumerB {
    @KafkaListener(topics = "update-location", topicPartitions = @TopicPartition(topic = "updated-location", partitions = {"2"}),groupId = "1")
    public void updatedLocation(String location) {
        System.out.println("partition-2" +location);
    }
}
