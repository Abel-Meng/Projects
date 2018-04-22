package com.mh.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 孟浩
 * @date 2018/4/12  15:15.
 */
@Service
public class SayHiService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHiError")
    public String hiService() {
        return restTemplate.getForObject("http://SERVICE-HI/hi",String.class);
    }

    public String sayHiError() {
        return "断路器执行";
    }
}
