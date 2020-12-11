package com.tactfactory.microservice.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Microservice2211FrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2211FrontendApplication.class, args);
	}

}
