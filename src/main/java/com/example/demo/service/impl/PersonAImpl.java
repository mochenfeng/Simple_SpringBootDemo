package com.example.demo.service.impl;

import com.example.demo.service.PersonService;
import lombok.Data;
import org.springframework.stereotype.Service;


@Service
public class PersonAImpl implements PersonService {

    @Override
    public String eat(String str) {
        return "正在吃" + str;
    }
}
