package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepo;

@Service
public class LoginService {

    @Autowired
    private LoginRepo repo;

    // Authenticate the user by username and password
    public boolean authenticate(Login login) {
        // Use the method to check if the username and password exist
        Login validLogin = repo.findByUsernameAndPassword(login.getUsername(), login.getPassword());
        return validLogin != null; // Returns true if validLogin is not null
    }
}

