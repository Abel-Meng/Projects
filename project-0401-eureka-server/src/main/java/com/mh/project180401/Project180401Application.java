package com.mh.project180401;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Project180401Application {

    public static void main(String[] args) {
        SpringApplication.run(Project180401Application.class, args);
    }
}
