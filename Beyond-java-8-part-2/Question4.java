sealed class ParentClass permits ParentClass1, ChildClass1, ChildClass2 {}

non-sealed class ParentClass1 extends ParentClass{}

final class ChildClass1 extends ParentClass {}

final class ChildClass2 extends ParentClass {}

class ChildClass3 extends ParentClass1 {}

public class Question4 {
    public static void main(String[] args) {
        ParentClass p1 = new ChildClass1();
        ParentClass p2 = new ChildClass2();
        ParentClass1 p3 = new ChildClass3();

        System.out.println("-------last lines-----");
    }
}
