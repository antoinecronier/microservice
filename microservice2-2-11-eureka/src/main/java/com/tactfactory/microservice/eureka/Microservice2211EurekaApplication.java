package com.tactfactory.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservice2211EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2211EurekaApplication.class, args);
	}

}
