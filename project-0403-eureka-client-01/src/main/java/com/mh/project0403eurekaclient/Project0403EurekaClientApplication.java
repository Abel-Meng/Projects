package com.mh.project0403eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class Project0403EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Project0403EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi/{name}")
    public String Home(@PathVariable String name){
        return "hi "+name+",i am from port:" +port;
    }
}
