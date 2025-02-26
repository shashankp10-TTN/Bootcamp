/*
    Create a custom exception that do not have any stack trace.
 */

import java.util.Scanner;

class CustomExceptionClass extends Exception {
    public CustomExceptionClass (String message) {
        super(message);
    }
}
public class Question9 {
    public static void checkPassword(String password) throws CustomExceptionClass{
        if(!password.equals("password")){
            throw new CustomExceptionClass("Invalid password");
        }else{
            System.out.println("User logged in successfully!!");
        }
    }
    public static void main(String[] args) throws CustomExceptionClass{
        Scanner sc = new Scanner(System.in);
        String userPassword = sc.nextLine();
        try {
            checkPassword(userPassword);
        }catch(CustomExceptionClass e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("general exception");
        }
    }
}
