package com.bootcamp.jpa_assignment.service;

import com.bootcamp.jpa_assignment.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployee(Integer id);
    Long  countOfEmployees();
    List<Employee> findEmployeeByName(String name);
    List<Employee> findEmployeeStartingWith(String prefix);
    List<Employee> findEmployeeAgeBetween(Integer startAge, Integer endAge);
}
