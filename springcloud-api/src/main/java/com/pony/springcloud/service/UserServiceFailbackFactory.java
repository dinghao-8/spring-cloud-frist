package com.pony.springcloud.service;

import com.pony.springcloud.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceFailbackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public List<User> findall() {
                List<User> users = new ArrayList<User>();
                users.add(new User().setUserName("not found"));
                return users;
            }
        };
    }
}
