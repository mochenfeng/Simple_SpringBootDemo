package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        String a ="123";
        String b = "123";
        System.out.println("null".equals(String.valueOf(a))?"莫晨锋":"陈雨露");
        System.out.println("b的值:" + b.isEmpty());
    }
}

