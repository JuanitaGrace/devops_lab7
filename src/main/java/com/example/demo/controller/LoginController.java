package com.example.demo.controller;

import com.example.demo.domain.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@ModelAttribute("login") Login login, Model model) {
        if ("user".equals(login.getUsername()) && "pass".equals(login.getPassword())) {
            return "welcome"; // <-- This should match what your test expects
        } else {
            model.addAttribute("error", "Invalid credentials!");
            return "login";
        }
    }
}
