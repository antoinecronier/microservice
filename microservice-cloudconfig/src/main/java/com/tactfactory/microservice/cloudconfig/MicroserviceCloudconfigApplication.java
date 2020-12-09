package com.tactfactory.microservice.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceCloudconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCloudconfigApplication.class, args);
	}

}
