package com.swjd.service;

import com.swjd.bean.User;

import java.util.List;

public interface UserService {
    List<User> list();

    List<User> selectByName(String stuName);

    int del(Integer id);

    int add(User user);

    User selectById(Integer id);

    int update(User user);
}
