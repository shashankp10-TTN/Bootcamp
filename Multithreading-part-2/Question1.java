/*
    WAP to show usage of Callable and demonstrate how it is different from Runnable
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        Runnable taskUsingRunnable = () -> {
            System.out.println("Can't return values from the Runnable interface");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 1. Runnable doesn't return any value
            // 2. Runnable doesn't throw exception, hence need to surround sleep method with try-catch
        };

        Callable<String> taskUsingCallable = () -> {
            Thread.sleep(1000);
            return "Can return values from the callable interface";
        };

        threadPool.submit(taskUsingRunnable);
        System.out.println(threadPool.submit(taskUsingCallable).get());

        threadPool.shutdown();
    }
}
