package еnterprise.reentrantLock_4;

import sun.util.TimeZoneNameUtility;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Pavel on 28.03.2016.
 */
public class Locks {

    public static void main(String[] args) {
        final Locks locks = new Locks();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    locks.testTryLock();
                }
            }).start();
        }
    }

    private final Lock lock = new ReentrantLock();

    public void testLock() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "tries lock");
        lock.lock();
        try {
            System.out.println(threadName + "executing critical section");
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(threadName + "releasing lock");
            lock.unlock();
        }
    }

    public void testTryLock() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "tries lock");
        try {


            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {
                try {
                    System.out.println(threadName + "executing critical section");
                    Thread.sleep(20);
                } finally {
                    System.out.println(threadName + "releasing lock");
                    lock.unlock();
                }
            } else {
                System.out.println(threadName + " Unable acquire lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
