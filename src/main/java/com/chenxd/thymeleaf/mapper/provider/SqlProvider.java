package com.chenxd.thymeleaf.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class SqlProvider {
    public String getUser(){
        return new SQL(){{
           SELECT("name,age");
           FROM("user");
           WHERE("id=#{id}");
        }}.toString();
    }
}
