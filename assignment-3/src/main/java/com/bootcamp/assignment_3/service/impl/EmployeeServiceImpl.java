package com.bootcamp.assignment_3.service.impl;

import com.bootcamp.assignment_3.repository.EmployeeRepoJPQL;
import com.bootcamp.assignment_3.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepoJPQL employeeRepoJPQL;

    @Override
    public List<Object[]> getEmployeesWithSalaryAboveAverage() {
        return employeeRepoJPQL.getEmployeesFirstAndLastNameWithSalaryAboveAverage();
    }

    @Override
    public void updateEmployee(Double newSalary) {
        employeeRepoJPQL.updateEmployeeByAvgSalary(newSalary);
    }

    @Override
    public void deleteEmployee() {
        employeeRepoJPQL.deleteEmployeeByMinSalary();
    }

}
