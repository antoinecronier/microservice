package com.tactfactory.microservice.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservice2211CurrencyexchangeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2211CurrencyexchangeserviceApplication.class, args);
	}

}
