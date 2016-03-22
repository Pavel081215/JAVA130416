package еnterprise.synchronize;


public class CountDownLatch {
    private int counter = 0;
    private final Object lock = new Object();

    public CountDownLatch(int coutter) {
        this.counter = coutter;
    }


    public void await() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                if (counter > 0) {
                    lock.wait();
                }else {
                    lock.notify();
                    break;
                }
            }
        }
    }

    public void countDown() {
        synchronized (lock) {
            if (counter > 0) {
                counter--;
                System.out.println("Counter = " + counter);
            }
            if (counter == 0) {
                lock.notify();
            }
        }
    }


    public int getCounter() {
        return counter;
    }
}
