package com.lianxi.service_feign.controller;

import com.lianxi.service_feign.entity.User;
import com.lianxi.service_feign.feigninterface.HiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    HiInterface hiInterface;

    @RequestMapping("/hi")
    public List<User> hi (){

        return hiInterface.sayHi();

    }
}
