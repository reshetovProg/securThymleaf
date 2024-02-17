package com.example.securtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping
    public String getIndexPage(){
        return "startPage";
    }
    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}
