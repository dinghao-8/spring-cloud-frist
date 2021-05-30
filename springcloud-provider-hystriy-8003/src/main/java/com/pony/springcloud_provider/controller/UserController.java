package com.pony.springcloud_provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pony.springcloud.pojo.User;

import com.pony.springcloud_provider.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGetall")
    public Object findAll(@PathVariable(value = "id", required = false) String id) {

        User byid = userService.findByid(Integer.valueOf(id));

        if (byid == null) {
            throw new RuntimeException("id不存在");
        }
        return byid;
    }

    @RequestMapping("/findall")
    public List<User> findAll() {
        return userService.findAll();
    }

    //@RequestMapping("/get/{id}")
    public Object hystrixGetall(String id) {
        return new User().setUserName("not found").setUserSex("not found");
    }


}
