package com.example.springmicroserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServerApplication.class, args);
	}

}
