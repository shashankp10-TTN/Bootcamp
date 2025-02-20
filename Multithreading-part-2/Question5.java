import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    WAP to showcase the difference between shutdown() and shutdownNow().
 */
public class Question5 {
    public static void main(String[] args) {
//        shutdownMethod();
        shutdownNowMethod();

        // Yeah!! code can be modularized... but right now production grade code is not expected :P
    }
    private static void shutdownMethod() {
        ExecutorService threadPool1 = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> {
            System.out.println("Submitted task 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task2 = () -> {
            System.out.println("Submitted task 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task3 = () -> {
            System.out.println("Submitted task 3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task4 = () -> {
            System.out.println("Submitted task 4");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task5 = () -> {
            System.out.println("Submitted task 5");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        threadPool1.execute(task1);
        threadPool1.execute(task2);
        threadPool1.execute(task3);
        threadPool1.execute(task4);
        threadPool1.execute(task5);
        threadPool1.shutdown();
    }

    private static void shutdownNowMethod() {
        ExecutorService threadPool1 = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> {
            System.out.println("Submitted task 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task2 = () -> {
            System.out.println("Submitted task 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task3 = () -> {
            System.out.println("Submitted task 3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task4 = () -> {
            System.out.println("Submitted task 4");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task5 = () -> {
            System.out.println("Submitted task 5");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        threadPool1.execute(task1);
        threadPool1.execute(task2);
        threadPool1.execute(task3);
        threadPool1.execute(task4);
        threadPool1.execute(task5);
        List<Runnable> interruptedTasks = threadPool1.shutdownNow();
        System.out.println(interruptedTasks);
    }
}
