package com.bootcamp.jpa_assignment.repository;

import com.bootcamp.jpa_assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);
    List<Employee> findByNameStartingWith(String prefix);
    List<Employee> findByAgeBetween(Integer startAge, Integer endAge);
}
