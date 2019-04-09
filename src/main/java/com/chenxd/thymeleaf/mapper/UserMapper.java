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

    /**
     * 使用Select注解，同时还有Insert/Update/Delete
     * @return
     */
    @Select("select name,age,phone from user")
    public List<User> getUsers();

    /**
     * 使用SelectProvider 进行sql拼写，同时还有InsertProvider/UpdateProvider/DeleteProvider
     * @param id
     * @return
     */
    @SelectProvider(type = SqlProvider.class,method = "getUser")
    public User getUserInfo(String id);

}
