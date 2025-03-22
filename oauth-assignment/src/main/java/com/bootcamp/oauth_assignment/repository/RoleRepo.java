package com.bootcamp.oauth_assignment.repository;

import com.bootcamp.oauth_assignment.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
