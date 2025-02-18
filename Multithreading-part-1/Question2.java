/*
    Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.
 */
class Bank implements Runnable {
    private int savings=100;
    @Override
    public void run() {
        System.out.println(withdraw(70));
    }

    public synchronized int getBalance() {
        return savings;
    }
    public synchronized boolean withdraw(int withdrawAmount) {
        System.out.println(Thread.currentThread().getName() + " has acquired the lock");
        if(withdrawAmount > savings) {
            System.out.println("Insufficient balance!!" );
            return false;
        }
        savings-=withdrawAmount;
        System.out.println("Current Balance : " + getBalance());
        System.out.println(Thread.currentThread().getName() + " has released lock");
        return true;
    }
}
public class Question2 {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread t1 = new Thread(bank, "Shashank");
        Thread t2 = new Thread(bank, "Aryan");
        t1.start();
        t2.start();

    }
}
