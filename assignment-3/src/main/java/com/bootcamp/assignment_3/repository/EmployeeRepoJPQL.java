package com.bootcamp.assignment_3.repository;

import com.bootcamp.assignment_3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepoJPQL extends JpaRepository<Employee, Integer> {
    /* 1) Display the first name, last name of all employees
         having salary greater than average salary
         ordered in ascending by their age and in descending by their salary.
    */
    @Query("SELECT e.firstName, e.lastName FROM Employee e " +
            "WHERE e.salary > (SELECT AVG(ee.salary) FROM Employee ee) " +
            "ORDER BY e.age ASC, e.salary DESC")
    List<Object[]> getEmployeesFirstAndLastNameWithSalaryAboveAverage();


    /*
        2) Update salary of all employees by a salary passed as a
        parameter whose existing salary is less than the average salary.
     */
    @Modifying
    @Query("UPDATE Employee e SET e.salary = :newSalary " +
            "WHERE e.salary < (SELECT AVG(ee.salary) FROM Employee ee)")
    @Transactional
    void updateEmployeeByAvgSalary(@Param("newSalary") Double newSalary);

    /*
        3) Delete all employees with minimum salary.
     */
    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e " +
            "WHERE e.salary = (SELECT MIN(ee.salary) FROM Employee ee)")
    void deleteEmployeeByMinSalary();
}
