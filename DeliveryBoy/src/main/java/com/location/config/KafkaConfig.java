package com.location.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public static final String LOCATION_UPDATE_TOPIC ="updated-location";
    @Bean
    public NewTopic newTopic()
    {
        return TopicBuilder.name(LOCATION_UPDATE_TOPIC).build();
    }
}
