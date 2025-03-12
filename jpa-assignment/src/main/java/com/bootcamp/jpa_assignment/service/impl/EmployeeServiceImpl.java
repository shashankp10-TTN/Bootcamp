package com.bootcamp.jpa_assignment.service.impl;

import com.bootcamp.jpa_assignment.entity.Employee;
import com.bootcamp.jpa_assignment.repository.EmployeeRepository;
import com.bootcamp.jpa_assignment.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{


    private final EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void updateEmployee(Employee employee) {
        Integer currEmployeeId = employee.getId();
        Employee currEmployee = null;
        if(employeeRepository.existsById(currEmployeeId)) {
            currEmployee = employeeRepository.findById(currEmployeeId).get();
            currEmployee.setId(currEmployeeId);
            currEmployee.setName(employee.getName());
            currEmployee.setAge(employee.getAge());
            currEmployee.setLocation(employee.getLocation());
            employeeRepository.save(currEmployee);
        }

    }

    @Override
    public void deleteEmployee(Integer currEmployeeId) {
        if(employeeRepository.existsById(currEmployeeId))
            employeeRepository.deleteById(currEmployeeId);
    }

    @Override
    public Long countOfEmployees() {
        return employeeRepository.count();
    }

    @Override
    public List<Employee> findEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> findEmployeeStartingWith(String prefix) {
        return employeeRepository.findByNameStartingWith(prefix);
    }

    @Override
    public List<Employee> findEmployeeAgeBetween(Integer startAge, Integer endAge) {
        return employeeRepository.findByAgeBetween(startAge, endAge);
    }
}
