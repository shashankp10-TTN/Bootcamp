import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

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
//        MyInterface count = (str) -> 10*CustomString.countHash(str);
//        System.out.println(count.countHashTime10("wetw#"));
//        Supplier<CustomString> l = () -> new CustomString();
        Supplier<CustomString> str = CustomString::new;
        str.get().setName("sdg");
//        System.out.println(count.apply("sdgds#"));



    }
}
