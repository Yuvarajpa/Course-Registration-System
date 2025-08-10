package com.example.Course.Registration.Project;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHashing {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder(12);

        String pt ="Admin123";
        String hashedPassword = encoder.encode(pt);
        System.out.println(hashedPassword +" :");
    }
}
