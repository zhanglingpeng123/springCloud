package com.lianxi.eurekaclient1.mapper;

import com.lianxi.eurekaclient1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper//指定这是一个操作数据库的mapper
public interface UserMapper {


    List<User> findAll();

    void editOrAdd(User user);
}
