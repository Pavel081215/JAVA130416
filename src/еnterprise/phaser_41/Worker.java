package еnterprise.phaser_41;


import java.util.concurrent.Phaser;


public class Worker implements Runnable {
    private Computation computation = new Computation();

    private int[] array;
    private Phaser phaser;
    public Object lock = new Object();

    private int pointStart;
    private int pointFinish;

    public Worker(Phaser phaser, int[] array, int pointStart, int pointFinsh) {
        this.phaser = phaser;
        this.array = array;
        this.pointStart = pointStart;
        this.pointFinish = pointFinsh;
    }


    public void run() {


        synchronized (lock) {
            computation.squareValuesArray(array, pointStart, pointFinish);

        }
        phaser.arriveAndAwaitAdvance();

        phaser.arriveAndDeregister();


    }
}