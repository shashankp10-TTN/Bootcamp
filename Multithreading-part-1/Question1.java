/*
    Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.
 */
class MyThreadClass extends Thread {
    @Override
     public void run() {
        System.out.println("Thread created using thread class");
    }
}

class MyThreadClass1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread created using runnable interface");
    }
}
/*
    Thread t1 = new MyThreadClass();
        t1.start();

        Runnable t2 = () -> {
            System.out.println("Thread created using Runnable interface");
        };
        t2.run();

        // sleep() method
        Runnable threadLoop = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
//        threadLoop.run();

        // join() method
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread-1");
            }
        });
        Runnable thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread-2");
            }
        });
        thread1.start();
 */
public class Question1 {
    public static void main(String[] args) {
        // Method - 1
        MyThreadClass threadUsingClass = new MyThreadClass();
        threadUsingClass.start();

        Runnable task = new MyThreadClass1();
        Thread t1 = new Thread(task);
              // OR
        Thread t = new Thread(() -> {
            System.out.println("Using runnable");
        });
       t.start();
       t1.start();

        // sleep() method
        Runnable threadLoop = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
//        threadLoop.run();

        // join() method
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread-1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread-2");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
