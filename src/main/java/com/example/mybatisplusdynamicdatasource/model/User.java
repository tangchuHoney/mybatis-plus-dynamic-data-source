package com.example.mybatisplusdynamicdatasource.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "pass_word")
    private String pass_word;
}
