package com.chenxd.thymeleaf.service;

import com.chenxd.thymeleaf.model.User;

import java.util.List;


public interface UserService {
    public User getUser(String id);

    public List<User> getUsers();

    public User getUserInfo(String id);
}
