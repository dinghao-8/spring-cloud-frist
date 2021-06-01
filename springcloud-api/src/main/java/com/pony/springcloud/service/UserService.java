package com.pony.springcloud.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.pony.springcloud.pojo.User;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@FeignClient(value = "SPRINGCLOUD-PROVIDERUSER",fallbackFactory = UserServiceFailbackFactory.class)
public interface UserService {

    @RequestMapping("/user/findall")
    public List<User> findall();
}
