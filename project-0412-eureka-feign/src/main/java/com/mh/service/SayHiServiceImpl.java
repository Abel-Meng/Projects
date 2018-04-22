package com.mh.service;

import org.springframework.stereotype.Component;

/**
 * @author 孟浩
 * @date 2018/4/12  17:03.
 */
@Component
public class SayHiServiceImpl implements SayHiService {
    @Override
    public String sayHiFromClientOne() {
        return "断路器启动";
    }
}
