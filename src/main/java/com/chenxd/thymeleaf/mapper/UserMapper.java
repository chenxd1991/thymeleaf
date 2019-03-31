package com.chenxd.thymeleaf.mapper;

import com.chenxd.thymeleaf.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUser(String id);
}
