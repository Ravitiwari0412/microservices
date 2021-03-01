package com.nagarro.professionals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProfessionalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessionalsApplication.class, args);
	}
//	http://localhost:8082/professional/1
//	http://localhost:8082/professional/Barber/Delhi

}
