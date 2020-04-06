package com.lianxi.eurekaclient1.service.serviceImpl;

import com.lianxi.eurekaclient1.entity.User;
import com.lianxi.eurekaclient1.mapper.UserMapper;
import com.lianxi.eurekaclient1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void editOrAdd(User user) {
        userMapper.editOrAdd(user);
    }
}
