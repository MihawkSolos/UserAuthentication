package com.example.user_login.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@EnableWebSecurity
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/secured")
    public String secured() {
        return "secured";
    }
}