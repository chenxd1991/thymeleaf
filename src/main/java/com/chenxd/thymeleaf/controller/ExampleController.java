package com.chenxd.thymeleaf.controller;

import com.chenxd.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController {
    @RequestMapping(value = "/example")
    public String example(ModelMap map){
        map.addAttribute("username","chenxd");
        map.addAttribute("flag","yes");
        List<User> userList = new ArrayList<>();
        User one = new User();
        one.setName("测试1");
        one.setAge(28);
        one.setPhone("182XXXXXXXX");
        User two = new User();
        two.setName("测试2");
        two.setAge(27);
        two.setPhone("183XXXXXXXX");
        userList.add(one);
        userList.add(two);
        return "example";
    }
}
