package com.example.securtest.controllers;


import com.example.securtest.entities.User;
import com.example.securtest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class RegistrationController {
    UserService service;

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }


    @PostMapping("/registration")
    public String registration(@ModelAttribute("user") User user, Model model){
        service.save(user);
        return "redirect:/login";
    }
}
