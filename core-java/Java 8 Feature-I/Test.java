import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//@FunctionalInterface
//interface MyInterface {
//    int countHashTime10(String str);
//}

class CustomString {
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
     int countHash(String str) {
        int count = 0;
        for(char ch : str.toCharArray())
            if(ch=='#')
                count++;
        return count;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,12,5,1,90, 87,32);
        List<Integer> subList = list.stream()
                                    .filter(num -> num%2==0)
                                    .collect(Collectors.toList());
        System.out.println(subList);


    }
}
