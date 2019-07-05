package com.zhh.docker.dockerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhh
 * @Date:Created in 9:59 2019/6/24 0024
 */
@RestController
public class Controller {


    @RequestMapping("/test")
    public String test(){
        System.out.println("docker test version: ");
        return "docker-demo11111";
    }
}