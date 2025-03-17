package com.bootcamp.assignment_3.service;

import java.util.List;

public interface EmployeeService {
    List<Object[]> getEmployeesWithSalaryAboveAverage();
    void updateEmployee(Double newSalary);
    void deleteEmployee();
}
