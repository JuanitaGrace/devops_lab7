package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, String> {
    
    // Custom query method to validate username and password
    Login findByUsernameAndPassword(String username, String password);
}

