import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
    Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value
 */
class Employee2 {
    private String name;
    private int age;
    private String designation;

    public Employee2(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", age = " + age +
                ", designation = " + designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee2 employee = (Employee2) obj;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
}
public class Question4 {
    public static void main(String[] args) {
        Map<Employee2, Double> employeeMap = new HashMap<>();
        employeeMap.put(new Employee2("Shashank", 60, "Software Engineer"), 5000000.00);
        employeeMap.put(new Employee2("Aryan", 22, "Software Engineer"), 6000000.00);
        employeeMap.put(new Employee2("Natik", 22, "Software Engineer"), 7000000.00);
        for(Map.Entry<Employee2, Double> mp : employeeMap.entrySet()) {
            System.out.println(mp.getKey().toString() + ", Salary : " + mp.getValue());
        }
    }
}
