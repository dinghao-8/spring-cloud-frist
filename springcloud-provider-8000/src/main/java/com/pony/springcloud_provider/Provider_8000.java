package com.pony.springcloud_provider;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

@MapperScan(basePackages="com.pony.springcloud_provider.dao")
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient

public class Provider_8000 {
    public static void main(String[] args) {
        SpringApplication.run(Provider_8000.class, args);
    }

    @Bean
    public ServletRegistrationBean registrationBean() {
        ServletRegistrationBean hystrixMetricsStreamServlet = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        hystrixMetricsStreamServlet.addUrlMappings("/actuator/hystrix.stream");
        return hystrixMetricsStreamServlet;
    }
}