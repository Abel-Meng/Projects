package com.mh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孟浩
 */
@SpringBootApplication
@RestController
public class Project0423EurekaConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project0423EurekaConfigClientApplication.class, args);
	}

	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
	@Value("${version}")
	private String version;
	@RequestMapping("/hi")
	public String sayHi(){
		return "你好，我是"+name+",年龄："+age+"岁。当前环境："+version;
	}
}
