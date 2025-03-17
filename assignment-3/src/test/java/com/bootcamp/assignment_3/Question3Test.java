package com.bootcamp.assignment_3;

import com.bootcamp.assignment_3.entity.CreditCard;
import com.bootcamp.assignment_3.entity.Employee;
import com.bootcamp.assignment_3.entity.Salary;
import com.bootcamp.assignment_3.repository.EmployeeRepoNative;
import com.bootcamp.assignment_3.repository.PaymentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Question3Test {

    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private EmployeeRepoNative employeeRepoNative;

    @Test
    public void createPaymentSingleTable() {
        CreditCard cc = new CreditCard();
        cc.setCreditcardNumber("12324355");
        cc.setAmount(1200.00);
        paymentRepo.save(cc);
    }

    @Test
    public void createPaymentTablePerClass() {
        CreditCard cc = new CreditCard();
        cc.setCreditcardNumber("12324355");
        cc.setAmount(1200.00);
        paymentRepo.save(cc);
    }

    @Test
    public void createPaymentJoinedClass() {
        CreditCard cc = new CreditCard();
        cc.setCreditcardNumber("12324355");
        cc.setAmount(1200.00);
        paymentRepo.save(cc);
    }

    @Test
    public void createEmployeeUsingComponentMapping() {
        Employee e = new Employee();
        e.setAge(99);
        e.setSalary(10000000.00);
        e.setFirstName("Shashank");
        e.setLastName("Pandey");
        Salary salary = new Salary();
        salary.setBasicSalary(200000.00);
        salary.setBonusSalary(10000.00);
        salary.setSpecialAllowanceSalary(12000.00);
        salary.setTaxAmount(50000.00);
        e.setSalaryDetail(salary);
        employeeRepoNative.save(e);
    }

}
