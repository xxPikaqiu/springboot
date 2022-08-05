package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer studentId) {
        return "查询学生studentId=" + studentId;
    }

    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        return "创建资源 student：name=" + name + "#age=" + age;
    }

    /**
     * 当路径变量名称和形参名一样，@PathVariable可以省略
     * @param id
     * @param age
     * @return
     */
    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable("id") Integer id, @PathVariable("age") Integer age) {
        return "更新资源，执行put请求方式：id=" + id + "#age=" + age;
    }

    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable("id") Integer id) {
        return "删除资源，执行delete，id=" + id;
    }

    @PutMapping("/student/test")
    public String test() {
        return "执行student/test，使用的请求方式 put";

    }

    @DeleteMapping("/student/testdelete")
    public String testDelete() {
        return "执行student/test，使用的请求方式 delete";

    }
}
