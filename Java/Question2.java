import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program to read user input until user writes XDONE and then show the entered text by the user on command line
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String str;

        do{
            System.out.println("Enter the string : ");
            str = sc.nextLine();
            list.add(str);
        }while(!str.equals("XDONE"));
        list.remove(list.size()-1);
        for(String s : list)
            System.out.println(s);
        sc.close();
    }
}
