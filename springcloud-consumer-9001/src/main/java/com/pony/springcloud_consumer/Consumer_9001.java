package com.pony.springcloud_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient//开启euteka客户端服务
@EnableFeignClients(basePackages = {"com.pony.springcloud"})//使用feign实现负载均衡时，开启feign并指明公共api中service的包
//@ComponentScans({@ComponentScan("com.pony.springcloud.service")})
/*componentScan 注解
    SpringbootApplication 注解中包含了componentScan注解，默认扫描的包是本项目的根目录，
    如果再显示声明componentScan注解时，声明的包不是本项目的根目录时，则会覆盖掉springbootapplication中导入默认的本项目的包
    所以此时需要将本项目的包和需要扫描自定义的包一起声明。
*/
@ComponentScan({"com.pony.springcloud","com.pony.springcloud_consumer"})

public class Consumer_9001 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_9001.class,args);
    }
}
