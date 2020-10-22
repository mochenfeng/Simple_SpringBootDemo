package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@RestController
@RequestMapping("testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {
        String data =  userService.Sel(id).toString();
        return data;
    }
}
