package com.lianxi.eurekaclient1.controller;

import com.lianxi.eurekaclient1.entity.User;
import com.lianxi.eurekaclient1.service.UserService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/list")
    public String showList(Model model){
        List<User>list = userService.findAll();
        model.addAttribute("userList", list);
        return "user";
    }

    @RequestMapping("/editOrAdd")
    public void editOrAdd(User user){
        userService.editOrAdd(user);
    }
}
