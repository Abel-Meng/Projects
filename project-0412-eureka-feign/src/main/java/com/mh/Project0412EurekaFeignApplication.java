package com.mh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 孟浩
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Project0412EurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project0412EurekaFeignApplication.class, args);
	}
}
