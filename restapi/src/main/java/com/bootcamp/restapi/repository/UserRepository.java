package com.bootcamp.restapi.repository;

import com.bootcamp.restapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
