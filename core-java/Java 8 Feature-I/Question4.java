/*
    Write a program to implement constructor reference
 */

import java.util.function.BiFunction;

class ParentClass {
    private int id;
    private String name;
    public ParentClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

@FunctionalInterface
interface ObjectionCreation {
    ParentClass createObject(int id, String name);
}
public class Question4 {
    public static void main(String[] args) {
        // Approach - 1
        ObjectionCreation obj = ParentClass::new;
        ParentClass instance = obj.createObject(3, "Shashank");
        System.out.println(instance);

        // Approach - 2
        BiFunction<Integer, String, ParentClass> obj1 = ParentClass::new;
        ParentClass instance1 = obj1.apply(5, "Shashank");
        System.out.println(instance1);
    }
}
