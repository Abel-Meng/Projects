package com.mh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Project0411EurekaClientBakApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project0411EurekaClientBakApplication.class, args);
	}

	@Value("${server.port}")
	private String serverPort;

	@RequestMapping("/hi")
	public String SayHi(){
		return "我来自端口号" + serverPort + "的服务";
	}
}
