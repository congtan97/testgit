package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String getWelcome() {
        return "welcome";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
