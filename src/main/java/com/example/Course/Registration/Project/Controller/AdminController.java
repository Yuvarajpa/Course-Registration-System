package com.example.Course.Registration.Project.Controller;

import com.example.Course.Registration.Project.Service.CourseService;
import com.example.Course.Registration.Project.Service.UserService;
import com.example.Course.Registration.Project.model.CourseRegistry;
import com.example.Course.Registration.Project.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudent(){
        return  courseService.enrolledStudent();
    }
    @Autowired
    UserService service;

    @PostMapping("/add-user")
    public void addUSer(@RequestBody Users user){
        service.add(user);
    }


}
