package com.swjd.service;

import com.swjd.bean.User;
import com.swjd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public List<User> selectByName(String stuName) {
        return userDao.selectByName(stuName);
    }

    @Override
    public int del(Integer id) {
        return del(id);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }
}
