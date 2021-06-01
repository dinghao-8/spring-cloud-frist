package com.pony.springcloud_configclient_5500.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestGetConfig {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;
    @RequestMapping("/getconfig")
    public  String get(){
        return "applicationName:"+applicationName +"\n"
                +"eurekaServer:"+eurekaServer +"\n"
                +"port:"+port;
    }

}
