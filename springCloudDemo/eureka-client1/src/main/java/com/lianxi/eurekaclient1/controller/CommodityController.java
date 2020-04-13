package com.lianxi.eurekaclient1.controller;


import com.lianxi.eurekaclient1.entity.Commodity;
import com.lianxi.eurekaclient1.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/commodity")
public class CommodityController {

@Autowired
private CommodityService  commodityService ;

@RequestMapping("/findAll")
public  List<Commodity> findAll(){
    return commodityService.findAll();
}






}
