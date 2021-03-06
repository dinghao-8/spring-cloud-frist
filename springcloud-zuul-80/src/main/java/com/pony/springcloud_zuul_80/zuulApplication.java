package com.pony.springcloud_zuul_80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy    //开启网关代理
public class zuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(zuulApplication.class,args);
    }
}
