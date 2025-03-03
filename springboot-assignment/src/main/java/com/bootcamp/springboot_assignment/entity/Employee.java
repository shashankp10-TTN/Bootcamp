package com.bootcamp.springboot_assignment.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Table(name = "Employee")
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EMPLOYEE_ID")
    private Long employeeId;

    @Column(name="EMPLOYEE_NAME")
    private String employeeName;

    @Column(name="EMPLOYEE_DESIGNATION")
    private String employeeDesignation;
}
