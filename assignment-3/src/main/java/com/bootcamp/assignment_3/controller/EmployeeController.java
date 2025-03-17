package com.bootcamp.assignment_3.controller;

import com.bootcamp.assignment_3.entity.Employee;
import com.bootcamp.assignment_3.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/get")
    public ResponseEntity<List<Object[]>> getEmployee() {
        return new ResponseEntity<>(employeeService.getEmployeesWithSalaryAboveAverage(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee(Double newSalary) {
        employeeService.updateEmployee(newSalary);
        return new ResponseEntity<>("User updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEmployee() {
        employeeService.deleteEmployee();
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }
}
