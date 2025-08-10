package com.example.Course.Registration.Project.Repository;

import com.example.Course.Registration.Project.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {


}
