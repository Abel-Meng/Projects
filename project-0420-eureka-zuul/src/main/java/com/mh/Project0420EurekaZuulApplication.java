package com.mh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy //开启zuul功能  主要功能是转发和过滤.
@SpringBootApplication
public class Project0420EurekaZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project0420EurekaZuulApplication.class, args);
	}
}
