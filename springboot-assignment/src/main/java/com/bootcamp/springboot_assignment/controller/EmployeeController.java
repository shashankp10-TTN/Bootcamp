package com.bootcamp.springboot_assignment.controller;

import com.bootcamp.springboot_assignment.entity.Employee;
import com.bootcamp.springboot_assignment.service.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Value("${com.bootcamp.springboot-assignment.salutation}")
    private String salutation;

    @Value("${com.bootcamp.springboot-assignment.message}")
    private String message;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        String welcomeMessage = String.format("%s %s %s", salutation, employee.getEmployeeName(), message);
        return new ResponseEntity<>(welcomeMessage, HttpStatus.OK);
    }
}
