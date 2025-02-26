import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;


class LazySingleton  {
    // Usage - Database connection, configuration manager, caching, logging framework
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Instance is created");
    }
    public static LazySingleton getInstance() {
        if(instance==null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
class EarlySingleton {
    private static EarlySingleton instance = new EarlySingleton();
    private EarlySingleton() {
        System.out.println("Instance is created");
    }
    public static EarlySingleton getInstance() {
        return instance;
    }
}

interface Vehicle {
    void drive();
}
// Step - 2
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(String vehicle) {
        if(vehicle.equalsIgnoreCase("Car")){
            return new Car();
        } else if (vehicle.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}

interface Prototype extends Cloneable {
    Prototype clone();
}

class Student implements Prototype {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        try{
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Hello");
        }
    }
}
public class Practice {
    public static void main(String[] args) {
        SequencedCollection<Integer> list = new ArrayList<>();
        /*
            1. reversed()
            2. getFirst()
            3. getLast()
            4. removeFirst()
            5. removeLast()
            6. addFirst()
            7. addLast()
         */
//        ReentrantLock lock = new ReentrantLock();
//        List<Integer> l = new ArrayList<>();
//        String day = "Sunday";
//        List<String> ll = Arrays.asList("abc", "amit", "abc", "bunty");
//        Map<String, Long> mp = ll.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        List<Integer> ll = Arrays.asList(1,12,93,1,2,3,3,3,1,12,5);
           Map<Integer, Long> map = ll.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(map);
    }


}
