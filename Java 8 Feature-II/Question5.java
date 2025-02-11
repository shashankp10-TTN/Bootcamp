
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

    }
}
