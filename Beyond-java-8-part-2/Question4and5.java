/*

    Q4. Use a Sealed class Class concept to create a class hierarchy
    Q5. Mark Child classes as final, sealed, and non sealed and observe their behavior
 */

sealed class ParentClass permits ParentClass1, ChildClass1, ChildClass2 {}

non-sealed class ParentClass1 extends ParentClass{}

final class ChildClass1 extends ParentClass {}

final class ChildClass2 extends ParentClass {}

class ChildClass3 extends ParentClass1 {}

public class Question4and5 {
    public static void main(String[] args) {
        ParentClass p1 = new ChildClass1();
        ParentClass p2 = new ChildClass2();
        ParentClass1 p3 = new ChildClass3();

        System.out.println("-------last lines-----");
    }
}
