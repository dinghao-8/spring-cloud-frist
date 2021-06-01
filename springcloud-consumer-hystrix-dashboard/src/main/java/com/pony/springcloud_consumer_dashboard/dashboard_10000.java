package com.pony.springcloud_consumer_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class dashboard_10000 {
    public static void main(String[] args) {
        SpringApplication.run(dashboard_10000.class,args);
    }
}
