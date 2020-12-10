package com.tactfactory.microservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class Microservice2211ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2211ZuulApplication.class, args);
	}

	@Bean
	public ZuulLoggingFilter loggingFilter() {
		return new ZuulLoggingFilter();
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
