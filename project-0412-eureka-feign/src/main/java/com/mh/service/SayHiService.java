package com.mh.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孟浩
 * @date 2018/4/12  16:50.
 */
@FeignClient(value = "service-hi",fallback = SayHiServiceImpl.class)
public interface SayHiService {

    @RequestMapping(value = "/hi")
    String sayHiFromClientOne();
}
