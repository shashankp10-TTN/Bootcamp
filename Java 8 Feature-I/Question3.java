/*
    Implement multiple inheritance with default method inside interface.
 */

interface Parent1 {
    default void print(){
        System.out.println("Printing from Parent1 class");
    }
}

interface Parent2 {
    default void print(){
        System.out.println("Printing from Parent2 class");
    }
}

class ChildClass implements Parent1, Parent2 {
    @Override
    public void print() {
        Parent1.super.print();
        Parent2.super.print();
    }
}
public class Question3 {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass();
        childObj.print();
    }

}
