package com.example.Course.Registration.Project.Repository;

import com.example.Course.Registration.Project.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<Users,Integer> {

    Users getByUsername(String username);
}
