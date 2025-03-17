package com.bootcamp.jpa_assignment_3.repository;

import com.bootcamp.jpa_assignment_3.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
