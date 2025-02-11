
/*
    Implement following functional interfaces from java.util.function using lambdas:
        1. Consumer 2. Supplier 3. Predicate 4. Function
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question1 {
    public static void main(String[] args) {
        // using function
        Function<String, Integer> stringLength = String::length;
        System.out.println("length : " + stringLength.apply("shashank"));

        // using consumer
        Consumer<String> greet = (name) -> {
            System.out.println("Hello!! " + name);
        };
        greet.accept("Shashank");

        // using supplier
        Supplier<Integer> rollDice = () -> {
            return (int)(Math.random()*6);
        };
        System.out.println(rollDice.get());

        // using predicate
        Predicate<Integer> isEven = (e) -> {
          return  e%2==0;
        };
        System.out.println(isEven.test(54));
    }
}
