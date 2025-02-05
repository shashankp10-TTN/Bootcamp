import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
    Write Java code to define List. Insert 5 floating point numbers in List, and using an iterator,
    find the sum of the numbers in List.
 */
public class Question1 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(Arrays.asList(23.21, 34.4, 56.12, 90.28, 81.78));
        double sum = 0;
        Iterator<Double> it = list.iterator();
        while(it.hasNext()) {
            sum+=it.next();
        }
        System.out.println(sum);
    }
}
