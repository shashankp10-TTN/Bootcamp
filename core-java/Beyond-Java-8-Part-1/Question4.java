import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Create Unmodifiable List from a Steam
 */
public class Question4 {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1,2,4,5).collect(Collectors.toUnmodifiableList());
        System.out.println(list);
    }
}
