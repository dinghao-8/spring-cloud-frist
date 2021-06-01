package com.pony.springcloud_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
//@RibbonClient
public class Consumer_9000 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_9000.class,args);
    }
}
