package com.mh.project0406servicefeign.controller;

import com.mh.project0406servicefeign.service.HelloService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    public String sayHi(@PathVariable String name){
        return helloService.sayHiFromClientOne(name);
    }
}
