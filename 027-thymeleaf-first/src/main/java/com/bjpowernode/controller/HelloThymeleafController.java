package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloThymeleafController {

    @RequestMapping("/hello")
    public String helloThymeleaf(HttpServletRequest request) {
        request.setAttribute("data", "欢饮使用Thymeleaf模板引擎");
        return "hello";
    }
}
