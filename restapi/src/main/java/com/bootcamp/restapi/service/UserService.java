package com.bootcamp.restapi.service;

import com.bootcamp.restapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();
    User getUserById(Long userId);
    List<String> getAllTopics();
}
