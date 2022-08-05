package com.bjpowernode.controller;

import com.bjpowernode.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@PropertySource(value = {"classpath:application.properties"},encoding = "UTF-8")
public class HelloController {


    @Value(("${server.port}"))
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String name;

    @Value("${site}")
    private String site;

    @Resource
    private SchoolInfo info;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData() {
        System.out.println("111111" + name);
        return name + ",site=" + site + ",项目的访问地址=" + contextPath + ",使用的端口=" + port;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo() {
        return "SchoolInfo对象==" + info.toString();
    }
}
