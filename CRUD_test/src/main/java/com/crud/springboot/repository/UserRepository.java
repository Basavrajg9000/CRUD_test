package com.crud.springboot.repository;


import com.crud.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}