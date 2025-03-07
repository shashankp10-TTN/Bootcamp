package com.bootcamp.restapi.service.impl;

import com.bootcamp.restapi.entity.Employee;
import com.bootcamp.restapi.entity.User;
import com.bootcamp.restapi.repository.UserRepository;
import com.bootcamp.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    List<String> listTopics = new ArrayList<>(Arrays.asList("ArrayList", "LinkedList", "Stack", "Queue", "Tree", "Heap", "Graph"));

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        List<User> userList = userRepository.findAll();
        return userList
                .stream()
                .filter(e -> e.getId().equals(userId))
                .findFirst()
                .orElse(null);
    }

    public List<String> getAllTopics() {
        return listTopics;
    }
}
