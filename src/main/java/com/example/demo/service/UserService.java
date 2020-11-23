package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User Sel(int id);
    public int delete(int id);
    public int update(User user);
    public User addUser(User user);
}
