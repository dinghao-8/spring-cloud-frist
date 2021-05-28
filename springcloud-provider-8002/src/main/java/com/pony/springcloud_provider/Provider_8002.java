package com.pony.springcloud_provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan(basePackages="com.pony.springcloud_provider.dao")
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Provider_8002 {
    public static void main(String[] args){
        SpringApplication.run(Provider_8002.class,args);
    }
}
