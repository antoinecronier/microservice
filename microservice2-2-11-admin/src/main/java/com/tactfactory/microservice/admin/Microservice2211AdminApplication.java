package com.tactfactory.microservice.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
/**
 * Refer to https://codecentric.github.io/spring-boot-admin/1.4.3/#set-up-admin-server
 * */
public class Microservice2211AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice2211AdminApplication.class, args);
    }

}
