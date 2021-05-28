package com.pony.springcloud_consumer.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Application;
import com.pony.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    private static  final  String Rest_url_pre="http://SPRINGCLOUD-PROVIDERUSER";
    @RequestMapping("/findall")
    public List<User> findAll(){

        return restTemplate.postForObject(Rest_url_pre+"/user/findall",null, List.class);
    }
}
