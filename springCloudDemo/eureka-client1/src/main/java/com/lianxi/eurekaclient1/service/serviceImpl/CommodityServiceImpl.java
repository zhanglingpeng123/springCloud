package com.lianxi.eurekaclient1.service.serviceImpl;


import com.lianxi.eurekaclient1.entity.Commodity;
import com.lianxi.eurekaclient1.mapper.CommodityMapper;
import com.lianxi.eurekaclient1.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> findAll() {
        return commodityMapper.findAll();
    }

}
