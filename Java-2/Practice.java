import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Array<E> {
    
}
public class Practice {
    public static void main(String[] args) {
        Object[] obj = new Object[5];
        obj[0]  = 0;
        obj[1]  = 1;
        obj[2] = 'c';
        obj[3] = 'b';
        obj[4] = "string";
        for(Object o : Arrays.stream(obj).toArray())
            System.out.println(o);

        List<String> list = new ArrayList<>();

    }
}
