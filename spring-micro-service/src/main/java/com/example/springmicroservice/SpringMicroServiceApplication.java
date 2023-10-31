package com.example.springmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServiceApplication.class, args);
	}

}
