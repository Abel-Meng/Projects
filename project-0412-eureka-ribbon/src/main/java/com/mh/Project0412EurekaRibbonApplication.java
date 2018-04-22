package com.mh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 孟浩
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class Project0412EurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project0412EurekaRibbonApplication.class, args);
	}

	@Bean //向程序的ioc注入一个bean: restTemplate
	@LoadBalanced //restRemplate开启负载均衡的功能
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
