package com.example.mybatisplusdynamicdatasource.service;

import com.example.mybatisplusdynamicdatasource.model.User;
import com.example.mybatisplusdynamicdatasource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveBySlave_1() {
        //模拟数据
        User user = new User();
        user.setUser_name("testSlaver1");
        user.setPass_word("123456");
        userRepository.save(user);

        //模拟数据
//        jdbcTemplate.execute("insert  tb_user (user_name,pass_word) values ('testSlaver1','123456')");

    }

    public void saveBySlave_2() {

        //模拟数据
        User user = new User();
        user.setUser_name("testSlaver2");
        user.setPass_word("123456");
        userRepository.save(user);
//        jdbcTemplate.execute("insert  tb_user (user_name,pass_word) values ('testSlaver2','123456')");
    }

    public void saveByMater() {
        //模拟数据
        User user = new User();
        user.setUser_name("testMater");
        user.setPass_word("123456");
        userRepository.save(user);
//        jdbcTemplate.execute("insert  tb_user (user_name,pass_word) values ('testMaster','123456')");

    }

    public void saveByHeader() {
        //模拟数据
        User user = new User();
        user.setUser_name("testHeader");
        user.setPass_word("123456");
        userRepository.save(user);
//        jdbcTemplate.execute("insert  tb_user (user_name,pass_word) values ('testMaster','123456')");
    }

    public void saveBySession() {
        //模拟数据
        User user = new User();
        user.setUser_name("testHeader");
        user.setPass_word("123456");
        userRepository.save(user);
        //        jdbcTemplate.execute("insert  tb_user (user_name,pass_word) values ('testMaster','123456')");
    }
}
