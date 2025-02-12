/*
    Convert an Optional type into Stream
 */

import java.util.Optional;

public class Question2 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Shashank");
        System.out.println(name.getClass());
        System.out.println(name.stream().getClass());

    }
}
