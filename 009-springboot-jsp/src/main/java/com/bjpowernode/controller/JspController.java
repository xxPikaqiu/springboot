package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JspController {

    @RequestMapping("/myjsp")
    public String doJsp(HttpServletRequest request) {

        request.setAttribute("data","SpringBoot使用Jsp");
        // 视图的逻辑名称
        return "index";
    }
}
