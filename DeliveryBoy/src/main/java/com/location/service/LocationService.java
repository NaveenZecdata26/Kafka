package com.location.service;

import com.location.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private KafkaTemplate<String , String > kafkaTemplate ;

    public boolean produceMessage(String location)
    {
        kafkaTemplate.send(KafkaConfig.LOCATION_UPDATE_TOPIC,location);
        return true;
    }
}
