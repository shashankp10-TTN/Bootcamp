import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.
 */
public class Question3 {
    public static void main(String[] args) {
//        System.out.println("Using single thread....");
//        SingleThreadCreator();
        System.out.println("\nUsing fixed size thread....");
        FixedSizedThreadCreation();
//        System.out.println("\nUsing cached thread....");
//        CachedThreadCreation();

    }
    static void SingleThreadCreator() {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        Runnable addTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Addition: 5 + 3 = " + (5 + 3));
        };

        Runnable subtractTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Subtraction: 10 - 4 = " + (10 - 4));
        };

        Runnable multiplyTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Multiplication: 6 * 7 = " + (6 * 7));

        };

        Runnable divideTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Division: 20 / 5 = " + (20 / 5));

        };

        singleThreadExecutor.submit(addTask);
        singleThreadExecutor.submit(subtractTask);
        singleThreadExecutor.submit(multiplyTask);
        singleThreadExecutor.submit(divideTask);

        singleThreadExecutor.shutdown();
    }
    static void FixedSizedThreadCreation() {
        ExecutorService fixedSizeThreadExecutor = Executors.newFixedThreadPool(3);
        Runnable addTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Addition: 5 + 3 = " + (5 + 3));
        };

        Runnable subtractTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Subtraction: 10 - 4 = " + (10 - 4));

        };

        Runnable multiplyTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Multiplication: 6 * 7 = " + (6 * 7));

        };

        Runnable divideTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Division: 20 / 5 = " + (20 / 5));

        };

        fixedSizeThreadExecutor.submit(addTask);
        fixedSizeThreadExecutor.submit(subtractTask);
        fixedSizeThreadExecutor.submit(multiplyTask);
        fixedSizeThreadExecutor.submit(divideTask);

        fixedSizeThreadExecutor.shutdown();
    }
    static void CachedThreadCreation() {
        ExecutorService singleThreadExecutor = Executors.newCachedThreadPool();
        Runnable addTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Addition: 5 + 3 = " + (5 + 3));
        };

        Runnable subtractTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Subtraction: 10 - 4 = " + (10 - 4));

        };

        Runnable multiplyTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Multiplication: 6 * 7 = " + (6 * 7));

        };

        Runnable divideTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Performing Division: 20 / 5 = " + (20 / 5));

        };

        singleThreadExecutor.submit(addTask);
        singleThreadExecutor.submit(subtractTask);
        singleThreadExecutor.submit(multiplyTask);
        singleThreadExecutor.submit(divideTask);

        singleThreadExecutor.shutdown();
    }
    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
