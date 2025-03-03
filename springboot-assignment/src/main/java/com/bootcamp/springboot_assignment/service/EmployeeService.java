package com.bootcamp.springboot_assignment.service;

import com.bootcamp.springboot_assignment.entity.Employee;
import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployee();
}
