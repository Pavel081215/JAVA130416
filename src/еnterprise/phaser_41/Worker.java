package еnterprise.phaser_41;

import java.util.concurrent.Phaser;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
    private Computation computation = new Computation();
    private Lock lockFirstPart = new ReentrantLock();
    private Lock lockSecondPatr = new ReentrantLock();
    private int[] array;
    private Phaser phaser;

    public Worker(Phaser phaser, int[] array, int pointStart, int pointFinsh) {
        this.phaser = phaser;
        this.array = array;
        this.pointStart = pointStart;
        this.pointFinish = pointFinsh;
    }

    private int pointStart;
    private int pointFinish;
    public long result;


    public void run() {
        // System.out.println(Thread.currentThread().getName() + "меин регистрация");

        lockFirstPart.lock();
        long result = computation.squareValuesArray(array, pointStart, pointFinish);
        lockFirstPart.unlock();
        System.out.println(Thread.currentThread().getName() + "Первая фаза  " + result);
        phaser.arriveAndAwaitAdvance();

        lockSecondPatr.lock();
        SumSquare.resultNew += result;
        lockSecondPatr.unlock();
        System.out.println(Thread.currentThread().getName() + "Вторая  фаза  " + SumSquare.resultNew);
        phaser.arriveAndAwaitAdvance();


    }
}
