package com.bootcamp.restapi.service;

import com.bootcamp.restapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
    void updateEmployeeById(Long id, Employee updatedEmployeeData);

}
