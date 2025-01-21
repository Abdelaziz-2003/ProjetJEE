package com.microservices.commandes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class MicroserviceCommandesApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCommandesApplication.class, args);
	}
}
