package com.swjd.dao;

import com.swjd.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    List<User> list();

    List<User> selectByName(String stuName);

    int del(Integer id);

    int add(User user);

    User selectById(Integer id);

    int update(User user);
}
