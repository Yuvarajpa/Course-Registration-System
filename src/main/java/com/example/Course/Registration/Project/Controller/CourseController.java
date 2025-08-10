package com.example.Course.Registration.Project.Controller;


import com.example.Course.Registration.Project.Service.CourseService;
import com.example.Course.Registration.Project.model.Course;
import com.example.Course.Registration.Project.model.CourseRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

        @GetMapping("/courses")
        public List<Course> availableCourses(){
            return courseService.availableCourses();
        }



        @PostMapping("courses/register")
    public String enrollStudent(@RequestParam("name") String name,
                                @RequestParam("emailId")String emailId,
                                @RequestParam("courseName") String courseName){
            courseService.enrolledStudent(name,emailId,courseName);
            return "Congratulations "+name +" Enrollment Sucessful "+courseName;
        }


}
