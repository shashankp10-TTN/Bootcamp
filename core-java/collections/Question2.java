
/*
    Given the following class Employee
        class{ Double Age; Double Salary; String Name}
        Design the class in such a way that the default sorting should work on firstname and lastname.
        Also, Write a program to sort Employee objects based on salary using Comparator.
 */

import java.util.*;

class Employee implements Comparable<Employee> {
    private int age;
    private double salary;
    private String firstName;
    private String lastName;

    public Employee(int age, double salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee employee) {
        if(this.firstName.equals(employee.firstName))
            return this.lastName.compareTo(employee.lastName);
        return this.firstName.compareTo(employee.firstName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
public class Question2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(new Employee(201, 409000000.00, "Shashank", "Pandey"),
                    new Employee(23, 8090900.00, "Something", "surname1"),
                    new Employee(56, 2350023.454, "First", "second"),
                    new Employee(39, 7500000.00, "Amit", "Verma"),
                    new Employee(30, 12000000.00, "Vikas", "Singh"),
                    new Employee(41, 5600000.50, "Neha", "Gupta"),
                    new Employee(28, 8900000.75, "Divya", "Rao")
        ));
        Collections.sort(employeeList);
        System.out.println(employeeList);
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println(employeeList);

    }
}
