package com.pony.springcloud_registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Register7003 {

    public static void main(String[] args) {
        SpringApplication.run(Register7003.class,args);
    }
}
