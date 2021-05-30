package com.pony.springcloud_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
//@RibbonClient
public class Consumer_7000 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_7000.class,args);
    }
}
