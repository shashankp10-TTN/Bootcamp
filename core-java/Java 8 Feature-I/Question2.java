import java.util.function.BiFunction;
import java.util.function.Function;

/*
    Using (instance) Method
        reference create and apply add and subtract method
    Using (Static) Method
        reference create and apply multiplication method for the functional interface created
 */
class InstanceMethod {
    public int sum(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }
}

class StaticMethod {
    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) throws CannotDivideByZeroException{
        if(b==0)
            throw new CannotDivideByZeroException("Cannot divide by Zero");
        return a/b;
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message){
        super(message);
    }
}
public class Question2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumOfTwoNumber = new InstanceMethod()::sum;
        System.out.println(sumOfTwoNumber.apply(5, 9));

        BiFunction<Integer, Integer, Integer> differenceOfTwoNumber = new InstanceMethod()::subtract;
        System.out.println(differenceOfTwoNumber.apply(6, 1));

        BiFunction<Integer, Integer, Integer> productOfTwoNumber = StaticMethod::multiply;
        System.out.println(productOfTwoNumber.apply(7, 9));

//        BiFunction<Integer, Integer, Integer> divisionOfTwoNumber = StaticMethod::divide;
        BiFunction<Integer, Integer, Integer> divisionOfTwoNumber = (a, b) -> {
            try {
                return StaticMethod.divide(a, b);
            } catch(CannotDivideByZeroException e){
                System.out.println(e.getMessage());
                return null;
            }
        };
        System.out.println(divisionOfTwoNumber.apply(16, 4));

    }
}
