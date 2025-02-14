import java.util.Objects;

public class Question1To3 {
    public static void main(String[] args) {

        record Student(int id, String name, String standard){
            public Student {
                if(name == null || standard == null)
                    throw new IllegalArgumentException("Fields cannot be null");
            }
        };
        Student s1 = new Student(1, "Shashank", "1st");
        Student s2 = new Student(1, "Shashank", "1st");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());   // equals() and hashCode() methods are overridden by default
    }
}
