package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.entity.TeamEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("team")
public class TeamController {

    /**
     * 直接以String接受前端传过来的json数据
     * @param jsonString
     * @return
     */
    @RequestMapping("mytest01")
    public String myTest01(@RequestBody String jsonString) {
        System.out.println(jsonString);
        return  jsonString;
    }

    /**
     * 以较简单的User对象接受前端传过来的json数据
     * @param studentEntity
     * @return
     */
    @RequestMapping("mytest02")
    public String myTest02(@RequestBody StudentEntity studentEntity) {
        System.out.println(studentEntity.toString());
        return studentEntity.toString();
    }

    /**
     * 以较复杂的Team对象接受前端传过来的json数据
     * @param teamEntity
     * @return
     */
    @RequestMapping("mytest03")
    public String myTest03(@RequestBody TeamEntity teamEntity) {
        System.out.println(teamEntity.toString());
        return teamEntity.toString();
    }

    /**
     * @RequestMapping与简单的@RequestParam()同时使用
     * @param studentEntity
     * @param token
     * @return
     */
    @RequestMapping("mytest04")
    public String myTest04(@RequestBody StudentEntity studentEntity, @RequestParam("token") String token) {
        System.out.println(studentEntity.toString());
        System.out.println(token);
        String name = studentEntity.getName();
        return token + "====>" +studentEntity.toString();
    }

    /**
     * @RequestBody于复杂的@RequestParam()同时使用
     * @param studentEntity
     * @param arrays
     * @return
     */
    @RequestMapping("mytest06")
    public String myTest05(@RequestBody StudentEntity studentEntity, @RequestParam("arrays") List<String> arrays){
        System.out.println(studentEntity.toString());
        StringBuffer sb = new StringBuffer();
        for (String array :arrays) {
            sb.append(array);
            sb.append("\n");
            System.out.println(array);
        }

        return sb.toString() + "--------" + studentEntity.toString();
    }
}
