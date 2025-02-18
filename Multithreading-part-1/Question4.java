import java.util.function.Consumer;

/*
    Write a code to simulate a deadlock in java
 */
public class Question4 {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    public void example(){
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread-1... Acquired lock-1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread-1 waiting for lock-2");
                synchronized (lock2) {
                    System.out.println("Thread-1 has acquired both locks");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread-2... Acquired lock-2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread-2 waiting for lock-1");
                synchronized (lock1) {
                    System.out.println("Thread-2 has acquired both locks");
                }
            }
        });

        t1.start();
        t2.start();
        System.out.println("program completed");
    }
    public static void main(String[] args) {
        Question4 q = new Question4();
        q.example();
    }
}
