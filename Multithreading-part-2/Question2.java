import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
    Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the deadlock using reentract lock.
 */
public class Question2 {
    ReentrantLock rLock1 = new ReentrantLock();
    ReentrantLock rLock2 = new ReentrantLock();

    public void example(){
        Thread t1 = new Thread(() -> {
            boolean isLock1Acquired = false;
            boolean isLock2Acquired = false;
            try {
                isLock1Acquired = rLock1.tryLock(1500, TimeUnit.MILLISECONDS);
                if (isLock1Acquired){
                    System.out.println("Thread-1 has acquired lock-1");
                    Thread.sleep(1000);
                    isLock2Acquired = rLock2.tryLock(1500, TimeUnit.MILLISECONDS);
                    if(isLock2Acquired) {
                        System.out.println("Thread-1 has acquired both locks");
                    } else {
                        System.out.println("Couldn't acquire lock-2 hence releasing lock-1 as well");
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                if(isLock1Acquired) {
                    rLock1.unlock();
                    System.out.println("Thread-1 releasing lock-1");
                }
                if(isLock2Acquired) {
                    rLock2.unlock();
                    System.out.println("Thread-1 releasing lock-2");
                }
            }
            System.out.println("Thread-1 waiting for lock-2");

        });
        Thread t2 = new Thread(() -> {
            boolean isLock1Acquired = false;
            boolean isLock2Acquired = false;
            try {
                isLock2Acquired = rLock2.tryLock(1500, TimeUnit.MILLISECONDS);
                if (isLock2Acquired){
                    System.out.println("Thread-2 has acquired lock-2");
                    Thread.sleep(1000);
                    isLock1Acquired = rLock1.tryLock(1500, TimeUnit.MILLISECONDS);
                    if(isLock1Acquired) {
                        System.out.println("Thread-1 has acquired both locks");
                    } else {
                        System.out.println("Couldn't acquire lock-1 hence releasing lock-2 as well");
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                if(isLock2Acquired) {
                    rLock2.unlock();
                    System.out.println("Thread-2 releasing lock-2");
                }
                if(isLock1Acquired) {
                    rLock1.unlock();
                    System.out.println("Thread-2 releasing lock-1");
                }
            }
            System.out.println("Thread-1 waiting for lock-2");

        });
        t1.start();
        t2.start();

    }
    public static void main(String[] args) {
        Question2 q = new Question2();
        q.example();
        System.out.println("program completed");
    }
}
