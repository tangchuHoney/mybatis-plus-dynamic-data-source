package com.example.mybatisplusdynamicdatasource.repository;

import com.example.mybatisplusdynamicdatasource.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
