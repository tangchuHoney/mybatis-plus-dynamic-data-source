package com.example.mybatisplusdynamicdatasource.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.mybatisplusdynamicdatasource.model.User;
import com.example.mybatisplusdynamicdatasource.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "UserController",tags = "用户控制器")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

     //测试地址 http://localhost:12002/user/master
    //测试地址 http://localhost:12002/user/slave_1
    //测试地址 http://localhost:12002/user/slave_2

    //swagger测试地址
    // http://127.0.0.1:12002/swagger-ui.html

    //ps ：数据库表很简单   自己建立对应的数据库 以及表就可以  这里就只提供一个 db_tenant1_1的sql文件
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

    @ApiOperation(value = "从头获取数据库名动态切换数据库")
    @GetMapping(value = "/fromhead")
    @DS("#header.tenantName")
    public void testhead() {

        //模拟数据
        userService.saveByHeader();
    }

    @ApiOperation(value = "从当前会话session获取数据库名动态切换数据库")
    @GetMapping(value = "/fromsession")
    @DS("#session.tenantName")
    public void fromsession() {

        //模拟数据
        userService.saveBySession();
    }

    @DS("#tenantName")//使用spel从参数获取
    public void selectSpelByKey(String tenantName) {
    }

    @DS("#user.tenantName")//使用spel从复杂参数获取
    public void selecSpelByTenant(User user) {
    }
}