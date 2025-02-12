import java.util.stream.IntStream;

/*
    Use iterator stream method to generate a stream
 */
public class Question1 {
    public static void main(String[] args) {
        System.out.println(IntStream.iterate(1, i->i < 10, i -> i+2).getClass());
        IntStream.iterate(1, i->i < 10, i -> i+2).forEach(System.out::println);
    }
}
