package com.chenxd.thymeleaf.service.impl;

import com.chenxd.thymeleaf.mapper.UserMapper;
import com.chenxd.thymeleaf.model.User;
import com.chenxd.thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUser(String id){
        return userMapper.getUser(id);
    }

    public List<User> getUsers(){
        return userMapper.getUsers();
    }

    public User getUserInfo(String id){
        return userMapper.getUserInfo(id);
    }
}
