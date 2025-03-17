package com.bootcamp.assignment_3.repository;

import com.bootcamp.assignment_3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepoNative extends JpaRepository<Employee, Integer> {

     /* 1) Display the id, first name, age of all employees where last name ends with "singh"

      */
     @Query(value = "SELECT e.emp_id, e.emp_first_name, e.emp_age FROM employee e WHERE e.emp_last_name LIKE '%singh'", nativeQuery = true)
     List<Employee> getAllEmployeeEndingSingh();

    /*
     2) Delete all employees with age greater than 45(Should be passed as a parameter)
     */
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM employee WHERE emp_age >: age" , nativeQuery = true)
    void deleteEmployeeGreaterThan45(@Param("age") Integer age);
}
