package com.bootcamp.springboot_assignment.service.impl;

import com.bootcamp.springboot_assignment.entity.Employee;
import com.bootcamp.springboot_assignment.repository.EmployeeRepository;
import com.bootcamp.springboot_assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return List.of();
    }
}
