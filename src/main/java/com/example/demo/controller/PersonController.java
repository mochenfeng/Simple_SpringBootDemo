package com.example.demo.controller;

import com.example.demo.service.PersonService;
import com.example.demo.service.impl.PersonAImpl;
import com.example.demo.service.impl.PersonBImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {

    @Autowired
    private PersonService personAImpl;

    @Autowired
    private PersonService personBImpl;

    @RequestMapping("person")
    public String PersonA() {
        System.out.println(personAImpl.eat("火锅"));
        System.out.println(personBImpl.eat("水果"));
        return personAImpl.eat("火锅") + "............." + personBImpl.eat("水果");
    }
}
