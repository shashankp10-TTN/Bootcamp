package com.bootcamp.restapi.service.impl;

import com.bootcamp.restapi.entity.Employee;
import com.bootcamp.restapi.repository.EmployeeRespository;
import com.bootcamp.restapi.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceimpl implements EmployeeService {

    private final EmployeeRespository employeeRespository;

    @Override
    public void addEmployee(Employee employee) {
        employeeRespository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        List<Employee> employeeList = employeeRespository.findAll();
        return employeeList
                .stream()
                .filter(e -> e.getEmployeeId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRespository.deleteById(id);
    }

    @Override
    public void updateEmployeeById(Long id, Employee updatedEmployeeData) {
        employeeRespository
            .findById(id)
            .ifPresent(e -> {
                e.setEmployeeId(e.getEmployeeId());
                e.setName(updatedEmployeeData.getName());
                e.setAge(updatedEmployeeData.getAge());
                employeeRespository.save(e);
            });
    }
}
