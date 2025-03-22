package com.bootcamp.oauth_assignment.repository;

import com.bootcamp.oauth_assignment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
