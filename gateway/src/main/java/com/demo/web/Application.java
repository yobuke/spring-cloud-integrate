package com.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient            //通过该注解，实现服务发现，注册
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
        SpringApplication.run(Application.class, args);
    }
}
