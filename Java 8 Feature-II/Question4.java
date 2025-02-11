import java.util.Optional;

/*
    Write a program to showcase the use of optional class
 */
class User {
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class Question4 {
    public static void main(String[] args) {
        // Without optional class
        User user1 = new User(null,"password");
        System.out.println(user1.getEmail().contains("@")); // this will throw null pointer exception

        // With optional class -> I will read and solve it later
    }
}
