package com.lianxi.eurekaclient1.mapper;

import com.lianxi.eurekaclient1.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
public interface CommodityMapper {

    List<Commodity> findAll();
}
