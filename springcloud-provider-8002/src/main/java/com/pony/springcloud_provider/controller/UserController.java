package com.pony.springcloud_provider.controller;

import com.pony.springcloud.pojo.User;

import com.pony.springcloud_provider.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Object findAll(@PathVariable(value = "id",required = false) String id){
        if (id!=null){
          return  userService.findByid(Integer.valueOf(id));
        }
        return userService.findAll();
    }
    @RequestMapping("/findall")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/add")
    public Object add(@RequestBody User user){
        return userService.addUser(user);
    }
}
