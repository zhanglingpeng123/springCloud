package com.lianxi.service_feign.feigninterface;


import com.lianxi.service_feign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value ="service-hi")
public interface HiInterface  {
    @RequestMapping(value = "/api/user/findAll" , method = RequestMethod.GET)
    List<User> sayHi();
}
