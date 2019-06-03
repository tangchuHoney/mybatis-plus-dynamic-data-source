package com.example.mybatisplusdynamicdatasource.controller;

import com.baomidou.dynamic.datasource.DS;
import com.example.mybatisplusdynamicdatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

     //测试地址 http://localhost:12002/user/master
    //测试地址 http://localhost:12002/user/slave_1
    //测试地址 http://localhost:12002/user/slave_2
    @GetMapping(value = "/master")
    @DS("master")
    public void testMasterDb() {

        //模拟数据
        userService.saveByMater();
    }

    @GetMapping(value = "/slave_1")
    @DS("one")
    public void testSlaveDb_1() {

        //模拟数据
        userService.saveBySlave_1();
    }

    @GetMapping(value = "/slave_2")
    @DS("two")
    public void testSlaveDb() {

        //模拟数据
        userService.saveBySlave_2();
    }

}