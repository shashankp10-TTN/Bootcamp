import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Practice {
    int test() {
        try{
            System.out.println("inside try block");
            System.out.println(1/0);
            System.out.println("exception");
            return 1;
        }catch (Exception e) {
            System.out.println("inside catch block");
            return 2;
        }finally {
            System.out.println("Finally block");
//            System.out.println(1/0);
//            return 3;
        }
    }
    public static void main(String[] args) {

    }
}

