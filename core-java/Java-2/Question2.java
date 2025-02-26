import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
    Create a User class with fields: firstname, lastname, age, phonenumber.
    Write a program which accepts values of user fields from commandline, create object and append that to a text file.
    After every user creation the program should prompt:
        "Do you want to continue creating users?
        (Type QUIT to exit)" and keep on accepting values
        and writing to file unitl user quits.
 */
class User {
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;

    public User(String firstName, String lastName, int age, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "sample.txt";
        while(true){
            System.out.println("Enter the first name : ");
            String firstName = sc.nextLine();

            System.out.println("Enter the last name : ");
            String lastName = sc.nextLine();

            System.out.println("Enter the age : ");
            int age = sc.nextInt();

            System.out.println("Enter the contact no. : ");
            long phone = sc.nextLong();
            sc.nextLine();

            User newUser = new User(firstName, lastName, age, phone);
            FileWriter writer = null;
            try {
                writer = new FileWriter(filePath, true);
                writer.write(newUser.toString() + "\n");
                System.out.println("User data added!!");
            } catch(IOException e) {
                System.out.println("Error occurred while adding user data...");
            } finally {
                if(writer!=null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("Error occurred while closing file...");
                    }
                }
            }
            System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
            String userInput = sc.nextLine();
            if(userInput.equals("QUIT"))
                break;

        }
        sc.close();
    }
}
