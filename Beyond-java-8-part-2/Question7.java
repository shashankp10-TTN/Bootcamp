import java.util.LinkedHashMap;
import java.util.SequencedMap;
/*
    Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.
 */
public class Question7 {
    public static void main(String[] args) {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Shashank", 4);
        map.put("abc", 2);
        map.put("xyz", 1);
        System.out.println(map);

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        map.pollFirstEntry();
        System.out.println(map);

        map.pollLastEntry();
        System.out.println(map.pollLastEntry());

        map.putFirst("Shashank", 100);
        System.out.println(map);

        map.putLast("xyz", 89);
        System.out.println(map.reversed());
    }
}
