package com.example.securtest.services;

import com.example.securtest.entities.User;
import com.example.securtest.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository repository;
    private BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    public void save(User user){
        user.setPassword(encoder().encode(user.getPassword()));
        repository.save(user);
    }
}
