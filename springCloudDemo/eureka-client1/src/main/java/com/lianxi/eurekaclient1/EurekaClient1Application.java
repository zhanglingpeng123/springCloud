package com.lianxi.eurekaclient1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@ComponentScan(basePackages = {"com.lianxi"})
@MapperScan(value="com.lianxi.eurekaclient1.mapper")
//@MapperScan(basePackages = {"com.lianxi"}, annotationClass = Mapper.class)
public class EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }

}
