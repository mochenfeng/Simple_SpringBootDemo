package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getAll() {
        return userMapper.getAll();
    }

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    public int delete(int id) {
        return userMapper.delete(id);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public User addUser(User user) {
        userMapper.addUser(user);
        return user;
    }
}
