package com.example.demo.service.impl;

import com.example.demo.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonBImpl implements PersonService {

    @Override
    public String eat(String str) {
        return "准备吃" + str;
    }
}
