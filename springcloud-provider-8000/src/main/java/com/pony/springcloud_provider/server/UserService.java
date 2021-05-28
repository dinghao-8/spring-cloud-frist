package com.pony.springcloud_provider.server;

import com.pony.springcloud.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    boolean addUser(User user);

    User findByid(Integer id);
}
