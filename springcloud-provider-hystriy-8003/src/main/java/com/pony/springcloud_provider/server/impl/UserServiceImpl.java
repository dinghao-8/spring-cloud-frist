package com.pony.springcloud_provider.server.impl;

import com.pony.springcloud.pojo.User;

import com.pony.springcloud_provider.dao.UserDao;
import com.pony.springcloud_provider.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User findByid(Integer id) {
        return userDao.findByid(id);
    }
}
