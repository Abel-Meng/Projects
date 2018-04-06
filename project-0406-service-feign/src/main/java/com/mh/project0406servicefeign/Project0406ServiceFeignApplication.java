package com.mh.project0406servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Project0406ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Project0406ServiceFeignApplication.class, args);
    }
}
