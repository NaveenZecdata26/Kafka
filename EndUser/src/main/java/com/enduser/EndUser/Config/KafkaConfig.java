package com.enduser.EndUser.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public static final String LOCATION_UPDATE_TOPIC ="updated-location";
    public static final String GROUP_ID="1";
    @KafkaListener(topics = LOCATION_UPDATE_TOPIC,groupId = GROUP_ID)
    public void updatedLocation(String updatedLocation)
    {
        System.out.println(updatedLocation);

    }
}
