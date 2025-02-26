import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Created new thread");
    }
}
public class Practice {
    public static void main(String[] args) {
//        ProducerConsumerProblemUsingReentrantLock p = new ProducerConsumerProblemUsingReentrantLock();
//        ProducerConsumerProblemUsingWaitNotify p = new ProducerConsumerProblemUsingWaitNotify();
//        Thread producer = new Thread(() -> {
//            System.out.println("Producer is producing");
//            try {
//                p.produce();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        Thread consumer = new Thread(() -> {
//            System.out.println("Consumer is consuming");
//            try {
//                p.consume();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        producer.start();
//
//        consumer.start();

        MyThread work = new MyThread();
        Thread t1 = new Thread(work);
        t1.start();

    }
}
