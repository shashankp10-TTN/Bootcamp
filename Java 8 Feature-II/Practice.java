import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private int id;
    private String name;
    private Float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\nEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public float getSalary() {
        return this.salary;
    }
}
public class Practice {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "shashank", 500),
                                                    new Employee(2, "ajeet", 1000),
                                                    new Employee(2, "sid", 1200),
                                                    new Employee(1, "shashank", 2100),
                                                    new Employee(2, "random", 200));
//        Collections.sort(employeeList, (a, b) -> Float.compare(b.getSalary(), a.getSalary()));
//        System.out.println(employeeList);


//        // Question 1
//        List<Employee> employeesStartWithCharacterA =  employeeList.stream()
//                .filter(str -> str.getName().startsWith("a"))
//                .collect(Collectors.toList());
//
        // Question 2
//        List<Float> employeesHavingSalaryGreaterThan1000 = employeeList.stream()
//                                                            .filter(e -> e.getSalary() > 1000)
//                                                            .map(employee -> employee.getSalary()*2)
//                                                            .collect(Collectors.toList());
//        System.out.println("###################### " + employeesHavingSalaryGreaterThan1000 + "########################");
//
//        // Question 3
//        List<Employee> distinctEmployees = employeeList.stream().distinct().collect(Collectors.toList());
//        System.out.println(distinctEmployees);

        List<Integer> numList = Arrays.asList(1,3,7,34,13,9,11,56,2);
        List<String> strList = Arrays.asList("hellohihgire", "qwewq", "bye", "Zzzzz");

        // Count how many times each word appears in a list of words.
        Map<Integer, Long> res = numList.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        Map<String, Integer> res1 = strList.stream().collect(Collectors.toMap(word -> word, String::length));

        String longestString = strList.stream().reduce("", (str1, str2) -> str1 + ", " + str2);
        System.out.println(longestString);
    }
}
