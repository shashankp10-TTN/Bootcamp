package com.bootcamp.jpa_assignment.controller;

import com.bootcamp.jpa_assignment.entity.Employee;
import com.bootcamp.jpa_assignment.repository.EmployeeRepository;
import com.bootcamp.jpa_assignment.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployee() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return new ResponseEntity<>(employeeList, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{currEmployeeId}")
    public ResponseEntity<String> updateEmployee(@PathVariable Integer currEmployeeId) {
        employeeService.deleteEmployee(currEmployeeId);
        return new ResponseEntity<>("User deleted", HttpStatus.OK);
    }

    @GetMapping("/get/{employeeName}")
    public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String employeeName) {
        List<Employee> employeeList = employeeService.findEmployeeByName(employeeName);
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/get/byCharacter")
    public ResponseEntity<List<Employee>> getEmployeeNameStartingWithA() {
        List<Employee> employeeList = employeeService.findEmployeeStartingWith("A");
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/get/byAge")
    public ResponseEntity<List<Employee>> getEmployeeByAgeBetween() {
        List<Employee> employeeList = employeeService.findEmployeeAgeBetween(28,32);
        return new ResponseEntity<>(employeeList, HttpStatus.CREATED);
    }

}
