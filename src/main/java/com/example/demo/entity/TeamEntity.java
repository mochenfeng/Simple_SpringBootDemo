package com.example.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class TeamEntity {
    private Integer id;
    private String teamName;
    private List<String> honors;
    private List<StudentEntity> teamMembers;

    @Override
    public String toString() {
        //遍历出小组所获荣耀
        StringBuffer sbHonors = new StringBuffer("荣耀start----\n");
        for (String honor:honors) {
            sbHonors.append(honor);
            sbHonors.append("\n");
        }
        sbHonors.append("荣耀end----\n");

        //遍历出小组成员
        StringBuffer sbMembers = new StringBuffer("成员start----\n");
        for (StudentEntity studentEntity:teamMembers) {
            sbMembers.append(studentEntity.toString());
            sbMembers.append("\n");
        }

        return "小组id:" + id + "\n" + "小组名字:" + teamName + "\n"
                    + "小组所获荣耀:" + sbHonors + "\n" + "小组成员:" +sbMembers + "\n";
    }
}
