package com.lianxi.eurekaclient1.service;


import com.lianxi.eurekaclient1.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void editOrAdd(User user);
}
