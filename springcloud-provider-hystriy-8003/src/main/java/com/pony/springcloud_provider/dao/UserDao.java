package com.pony.springcloud_provider.dao;

import com.pony.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> findAll();

    boolean addUser(User user);

    User findByid(Integer id);
}
