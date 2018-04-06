package com.mh.project0406serverribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient//向服务中心注册
public class Project0406ServerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(Project0406ServerRibbonApplication.class, args);
    }


    @Bean   //向程序的ioc注入一个bean restTemplate
    @LoadBalanced  //注解表明这个restRemplate开启负载均衡的功能
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
