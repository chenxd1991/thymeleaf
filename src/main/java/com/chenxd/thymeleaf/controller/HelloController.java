package com.chenxd.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = "/index")
    public String index(ModelMap model){
        model.addAttribute("message","chenxd");
        return "hello";
    }
}
