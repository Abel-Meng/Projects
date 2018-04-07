package com.mh.project0406serverribbon.controller;

import com.mh.project0406serverribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(){
        String name = "mh";
        return helloService.hiService(name);
    }

}
