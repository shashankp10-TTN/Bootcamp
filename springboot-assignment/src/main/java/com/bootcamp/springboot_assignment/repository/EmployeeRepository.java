package com.bootcamp.springboot_assignment.repository;

import com.bootcamp.springboot_assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
