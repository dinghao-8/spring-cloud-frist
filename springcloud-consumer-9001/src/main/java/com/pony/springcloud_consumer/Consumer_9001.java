package com.pony.springcloud_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.pony.springcloud"})
//@ComponentScans({@ComponentScan("com.pony.springcloud.service")})
@ComponentScan({"com.pony.springcloud","com.pony.springcloud_consumer"})
public class Consumer_9001 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_9001.class,args);
    }
}
