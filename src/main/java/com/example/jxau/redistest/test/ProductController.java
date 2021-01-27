package com.example.jxau.redistest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

@Controller
public class ProductController {
    @Autowired
    private RedisTemplate stringRedisTemplate;

    //    @Autowired
//    private CIpProperties cIpProperties;
//    @Autowired
//    private NameProperties nameProperties;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "success";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Object test() {
        stringRedisTemplate.opsForValue().set("keyTest", "1", 10, TimeUnit.SECONDS);
        return null;
    }
}

