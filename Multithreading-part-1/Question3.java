
/*
    WAP to showcase the usage of volatile in java.
 */
class Test {
    volatile boolean flag = false;
    public boolean checkFlag() {
        return flag;
    }
}

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        Thread t1 = new Thread(() -> {
           while(!t.checkFlag()){
               System.out.println("Inside while loop!!");
           }
            System.out.println("Flag turned true");
        });
        t1.start();
        Thread.sleep(1000);
        t.flag = false;
    }
}
