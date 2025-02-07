import java.util.*;

class Student implements Comparable<Student>{

    int id;
    private String name;
     int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

}

class CustomSort implements Comparator<Student>{

    @Override
    public int compare(Student student, Student t1) {
        return student.getId() - t1.getId();
    }
}
public class Practice {
    public static void main(String[] args) {
       Student s1 = new Student(1, "Shashank", 23);
       Student s2 = new Student(144, "randomName", 43);
       Student s3 = new Student (67, "oqwe", 4);
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(s1,s2,s3));
        System.out.println(studentList);
        System.out.println();
        Collections.sort(studentList, new CustomSort());
        System.out.println(studentList);

    }

}
