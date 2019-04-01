package com.chenxd.thymeleaf.mapper;

import com.chenxd.thymeleaf.mapper.provider.SqlProvider;
import com.chenxd.thymeleaf.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface UserMapper {
    public User getUser(String id);
    @Select("select name,age,phone from user")
    public List<User> getUsers();
    @SelectProvider(type = SqlProvider.class,method = "getUser")
    public User getUserInfo(String id);
}
