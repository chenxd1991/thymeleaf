package com.chenxd.thymeleaf.controller;

import com.chenxd.thymeleaf.model.User;
import com.chenxd.thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id, ModelMap model, HttpServletRequest request){
        User user = userService.getUser(id);
        request.setAttribute("user",user);
//        model.addAttribute("user",user);
//        model.addAttribute(user);
        model.addAttribute("name","chenxd");
        return "user";
    }
}
