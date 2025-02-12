import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
    Given a list of objects of following class:
        class Employee{ String fullName; Long salary; String city; }
        Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
    Note: Full name is concatenation of first name, middle name and last name with single space in between.
 */
class Employee1 {
    private String fullName;
    private Long salary;
    private String city;

    public Employee1(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class Question5 {
    public static void main(String[] args) {

        Employee1 e1 = new Employee1("Shashank Pandey", 9500L, "Delhi");
        Employee1 e2 = new Employee1("Aryan Kohli", 9000L, "Agra");
        Employee1 e3 = new Employee1("Kiran Sharma", 500L, "Delhi");
        Employee1 e4 = new Employee1("Shashank Pandey", 950L, "Delhi");
        List<Employee1> list = Arrays.asList(e1,e2,e3,e4);
        Set<String> uniqueEmployees = list.stream()
                                        .filter(e -> e.getSalary() < 5000)
                                        .filter(e -> e.getCity().equals("Delhi"))
                                        .map(e -> {
                                            return e.getFullName().split(" ")[0];
                                        }).collect(Collectors.toSet());
        System.out.println(uniqueEmployees);
    }
}
