import java.util.Scanner;

/*
    Write a java program to show following menu to the user:
    *******Menu*******
    1. Calculate Area of Circle
    2. Calculate Circumference of a Circle
    3. Exit.
    Choose an option (1-3): Take radius as user input. Hint: Use Switch statement to act on the menu.
    Also area and circumference methods should be static

 */
public class Question3 {
    private static double areaOfCircle(int radius){
        return Math.PI * radius * radius;
    }
    private static double circumferenceOfCircle(int radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("****MENU*****");
            System.out.println("1. Calculate the area of circle");
            System.out.println("2. Calculate the circumference of circle");
            System.out.println("3. Exit");
            int choose = sc.nextInt();
            if(choose==3)
                break;
            System.out.println("Enter the radius fo the circle : ");
            int radius = sc.nextInt();
            switch(choose) {
                case 1 :
                    System.out.println(areaOfCircle(radius));
                    break;
                case 2 :
                    System.out.println(circumferenceOfCircle(radius));
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

    }


}
