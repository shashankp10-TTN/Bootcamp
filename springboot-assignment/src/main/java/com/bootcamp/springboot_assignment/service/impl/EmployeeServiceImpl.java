package com.bootcamp.springboot_assignment.service.impl;

import com.bootcamp.springboot_assignment.entity.Employee;
import com.bootcamp.springboot_assignment.repository.EmployeeRepository;
import com.bootcamp.springboot_assignment.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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
        return employeeRepository.findAll();
    }

    @PostConstruct
    public void insertHardCodedEmployees() {
        List<Employee> employees = List.of(
                new Employee(null, "Shashank", "Software Engineer"),
                new Employee(null, "Aryan", "Software Engineer"),
                new Employee(null, "Random", "Frontend Developer")
        );
        employeeRepository.saveAll(employees);
    }
}
