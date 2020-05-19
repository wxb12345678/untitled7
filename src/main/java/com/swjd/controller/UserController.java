package com.swjd.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.swjd.bean.User;
import com.swjd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("all")
    public ModelAndView all(String stuName)  {
        System.out.println("name==="+stuName);
        if (stuName!=null && stuName!=""){
            ModelAndView modelAndView = new ModelAndView("index.jsp");
            System.out.println("username:"+stuName);
            List<User> users = userDao.selectByName(stuName);
            modelAndView.addObject("user",users);
            return modelAndView;
        }else {
            System.out.println("方法二");
            ModelAndView modelAndView = new ModelAndView("index.jsp");
            List<User> list = userDao.list();
            modelAndView.addObject("user",list);
            return modelAndView;
        }
    }
//    public ModelAndView q(String stuName){
//
//    }
//
//    public ModelAndView s(){
//
//    }

    @RequestMapping("del")
    public ModelAndView del(Integer id){
        ModelAndView modelAndView = new ModelAndView("index.jsp");
        int del = userDao.del(id);
        return all(null);
    }

    @RequestMapping("add")
    public ModelAndView add(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView("index.jsp");
        int add = userDao.add(user);
        if (add>0) return all(null);
        else return new ModelAndView("sb.jsp");
    }

    @RequestMapping("update")
    public ModelAndView update(Integer id){
        System.out.println("id==>"+id);
        ModelAndView modelAndView = new ModelAndView();
        User user = userDao.selectById(id);
        System.out.println("user1==>"+user);
        if (user!=null){
            System.out.println("update:user2"+user);
            modelAndView.addObject("us",user);
            modelAndView.setViewName("update.jsp");
            return modelAndView;
        } else {
            return new ModelAndView("sb.jsp");
        }
    }
    @RequestMapping("update2")
    public ModelAndView update2(User user){
        System.out.println("update2");
        int update = userDao.update(user);
        if (update>0){
            return all(null);
        } else {
            return new ModelAndView("sb.jsp");
        }
    }



}
