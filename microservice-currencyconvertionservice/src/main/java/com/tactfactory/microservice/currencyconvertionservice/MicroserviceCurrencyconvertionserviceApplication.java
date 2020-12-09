package com.tactfactory.microservice.currencyconvertionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.tactfactory.microservice.currencyconvertionservice.feigns")
public class MicroserviceCurrencyconvertionserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCurrencyconvertionserviceApplication.class, args);
	}

}
