import java.util.Scanner;

class Machine {
    public void print(){
        System.out.println("printing from machine class");
    }
}
interface Student {
    void print();
}
public class Practice extends Machine{
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4};
//        try {
//            System.out.println(arr[7]);
//        }catch(Exception e){
//            System.out.println("koi baat ni");
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Server up and running...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        System.out.println(a);
        System.out.println(s);
    }
}
