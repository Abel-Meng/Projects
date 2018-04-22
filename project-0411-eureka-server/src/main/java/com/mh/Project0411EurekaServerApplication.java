package com.mh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Project0411EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project0411EurekaServerApplication.class, args);
	}
}
