package com.pony.springcloud_registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Register7002 {

    public static void main(String[] args) {
        SpringApplication.run(Register7002.class,args);
    }
}
