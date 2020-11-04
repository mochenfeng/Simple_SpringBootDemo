package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 查询所有人
     * @return
     */
    List<User> getAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    User Sel(int id);

    /**
     * 删除
     * @param id 要删除人员的id
     */
    int delete(int id);

    /**
     * 更新
     * @param user 要更新的User实例
     */
    int update(User user);

    /**
     * 增加
     * @param user 要新增的User实例
     */
    int addUser(User user);
}
