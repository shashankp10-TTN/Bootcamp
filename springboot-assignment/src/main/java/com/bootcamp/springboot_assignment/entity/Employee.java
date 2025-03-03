package com.bootcamp.springboot_assignment.entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "Employee")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
