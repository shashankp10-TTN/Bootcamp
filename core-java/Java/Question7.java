/*
       WAP showing try, multi-catch and finally blocks.
 */

import java.io.FileReader;
import java.io.IOException;

public class Question7 {
    public static void main(String[] args) throws IOException {
        FileReader file = null;
        try {
            int[] arr = new int[]{1,2,4,5};
            System.out.println(arr[8]);

            int val = 1/0;
            System.out.println(val);

            file = new FileReader("some url");

        }catch(IndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }catch (ArithmeticException e){
            System.out.println("Can't divide by 0");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            file.close();
        }
    }
}
