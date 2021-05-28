package com.pony.springcloud_provider.controller;

import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderDetail {
    @Autowired
    DiscoveryClient client;

    @GetMapping("/serverdetail")
    public Object getDetail(String servername){
        List<String> services = client.getServices();
        services.stream().forEach(e-> System.out.println(e));

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDERUSER");
        instances.stream().forEach(e-> System.out.println(e));
        return instances;
    }

}
