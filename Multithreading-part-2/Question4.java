import java.util.Random;
import java.util.concurrent.*;

/*
    WAP to return a random integer value from a thread execution using Future.
 */
public class Question4 {
    public static void main(String[] args) throws Exception {
        ExecutorService fixedSizePool = Executors.newFixedThreadPool(2);

        Callable<Integer> generateRandomValue = () -> {
            Random random = new Random();
            Integer randomNum = random.nextInt(100);
            return randomNum;
        };

        Future<Integer> generateNum = fixedSizePool.submit(generateRandomValue);

        System.out.println(generateNum.get());

        fixedSizePool.shutdown();
    }
}

