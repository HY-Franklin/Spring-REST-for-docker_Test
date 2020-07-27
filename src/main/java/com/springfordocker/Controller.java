package com.springfordocker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/1")
    public Student s1(){
        Student s1=new Student((long)1,"Huanyu","逗比");
        return s1;
    }

    @GetMapping("/2")
    public Student s2(){
        Student s1=new Student((long)2,"Rita","傻呆");
        return s1;
    }
}
