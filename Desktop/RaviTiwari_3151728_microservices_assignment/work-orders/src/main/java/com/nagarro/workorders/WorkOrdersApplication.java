package com.nagarro.workorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WorkOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkOrdersApplication.class, args);
	}

}
