package com.mh.contorller;

import com.mh.service.SayHiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 孟浩
 * @date 2018/4/12  15:14.
 */
@RestController
public class SayHiController {


        @Resource
        private SayHiService sayHiService;
        @RequestMapping(value = "/hi")
        public String hi(){
            return sayHiService.sayHiFromClientOne();
        }
}
