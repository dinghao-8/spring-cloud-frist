package com.pony.springcloud_provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan(basePackages="com.pony.springcloud_provider.dao")
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class Provider_hystriy_8003 {
    public static void main(String[] args){
        SpringApplication.run(Provider_hystriy_8003.class,args);
    }
}
