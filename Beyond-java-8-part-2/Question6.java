import java.util.*;

/*
    Demonstrate the use of addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections
 */
public class Question6 {
    public static void main(String[] args) {
        // List
        SequencedCollection<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        list.addFirst(45);
        System.out.println(list);

        list.addLast(45);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        System.out.println(list.reversed());
        System.out.println(list); // doesn't reverse the actual list

        // Set
        SequencedCollection<Integer> set = new LinkedHashSet<>(Arrays.asList(3,4,5,6));
        System.out.println(set);

        set.addFirst(45);
        System.out.println(set);

        set.addLast(45);
        System.out.println(set);

        set.removeFirst();
        System.out.println(set);

        set.removeLast();
        System.out.println(set);

        set.getFirst();
        System.out.println(set);

        set.getLast();
        System.out.println(set);

        System.out.println(set.reversed());

    }
}
