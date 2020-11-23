package com.example.demo.entity;

import lombok.Data;

@Data
public class StudentEntity {
    private String name;
    private Integer age;
    private String gender;
    private String motto;

    @Override
    public String toString() {
        return age + "岁" + gender + "人[" + name +"]的座右铭居然是:" + motto + "!!!";
    }
}
