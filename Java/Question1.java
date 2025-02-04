/**
 *Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.
 */
public class Question1 {
    private static String firstName = "Shashank";
    private static String lastName = "Pandey";
    private static int age = 60;
    static {
        System.out.println("First name : " + firstName + " lastNamr : " + lastName + " age : " + age);
    }
    static void printUserDetail(){
        System.out.println("First name : " + firstName + " lastNamr : " + lastName + " age : " + age);
    }
    public static void main(String[] args) {
        printUserDetail();
    }
}
