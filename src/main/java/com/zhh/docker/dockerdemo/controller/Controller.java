package com.zhh.docker.dockerdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhh
 * @Date:Created in 9:59 2019/6/24 0024
 */
@RestController

public class Controller {
    private final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Value("${version}")
    String version;

    @RequestMapping("/test")
    public String test(){
        System.out.println("docker test version: "+version);
        logger.info("this is docker logs test");
        return "version: "+version;
    }
}