package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@RestController
@RequestMapping("testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

    @CrossOrigin
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {
        String data =  userService.Sel(id).toString();
        return data;
    }

    @RequestMapping("delete")
    public String delete(int id) {
        int result = userService.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else  {
            return  "删除失败";
        }
    }

    @RequestMapping("update")
    public String update(User user) {
        int result = userService.update(user);
        if (result >= 1) {
            return "更新成功";
        } else {
            return "更新失败";
        }
    }

    @RequestMapping("add")
    public User add(User user) {
        return userService.addUser(user);
    }
}
