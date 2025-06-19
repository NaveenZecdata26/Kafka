package com.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class DeliveryBoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryBoyApplication.class, args);
	}

}
