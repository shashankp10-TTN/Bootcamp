/*
    Sum all the numbers greater than 5 in the integer list using streams
 */

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 5, 6, 90, 54, 1, 89, 4);
        int sumGreaterThan5 = list.stream()
                                .filter(e -> e > 5)
                                .mapToInt(Integer::intValue)
                                .sum();
        System.out.println(sumGreaterThan5);
    }
}
