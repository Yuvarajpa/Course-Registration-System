package com.example.Course.Registration.Project.Service;

import com.example.Course.Registration.Project.model.Users;
import com.example.Course.Registration.Project.Repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

BCryptPasswordEncoder passwordEncoder =new BCryptPasswordEncoder(12);
    @Autowired
    UserDetailsRepo repo;


    public void add(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
}
