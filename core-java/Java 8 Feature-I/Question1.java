/*
    Write the following a functional interface and implement it using lambda:
        1. To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean
        2. Increment the number by 1 and return incremented value Parameter (int) Return int
        3. Concatenation of 2 string Parameter (String , String ) Return (String)
        4. Convert a string to uppercase and return . Parameter (String) Return (String)

 */

import java.util.function.*;

@FunctionalInterface
interface CompareTwoNumbers {
    boolean isFirstGreater(int a, int b);
}

@FunctionalInterface
interface IncrementByOne {
    int incrementValueByOne(int a);
}

@FunctionalInterface
interface ConcateTwoString {
    String concateTwoString(String str1, String str2);
}

@FunctionalInterface
interface ConvertToUpperCase {
    String convertToUpperCase(String str);
}

public class Question1 {

    public static void main(String[] args) {
        // Part - 1
        CompareTwoNumbers obj = (a,b) -> a > b;
        System.out.println(obj.isFirstGreater(32,5));

        BiPredicate<Integer, Integer> obj1 = (a, b) -> a > b;
        System.out.println(obj1.test(32, 5));

        // Part - 2
        IncrementByOne incrementByOne = (a) -> a = a + 1;
        System.out.println(incrementByOne.incrementValueByOne(6));

        Function<Integer, Integer> incrementByOne2 = (val) -> val+=1;
        System.out.println(incrementByOne2.apply(8));

        // Part - 3
        ConcateTwoString concat = (str1, str2) ->  str1.concat(str2);
        System.out.println(concat.concateTwoString("shashank ", "pandey"));

        BiFunction<String, String, String> concat1 = (str1, str2) -> str1.concat(str2);
        System.out.println(concat1.apply("shashank ", "pandey"));

        // Part - 4
//        ConvertToUpperCase upperCase = (String str) -> str.toUpperCase();
        ConvertToUpperCase upperCase = String::toUpperCase;
        System.out.println(upperCase.convertToUpperCase("dfgrp"));

        Function<String, String> upperCase1 = String::toUpperCase;
        System.out.println(upperCase1.apply("gwrtr"));
    }
}
