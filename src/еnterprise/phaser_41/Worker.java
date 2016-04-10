package еnterprise.phaser_41;

import java.util.concurrent.Phaser;

public class Worker implements Runnable {
    private Computation computation = new Computation();

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

        result = computation.squareValuesArray(array, pointStart, pointFinish);

        System.out.println(" выполняет фазу " + phaser.getPhase() + "  потоком - " + Thread.currentThread().getName() + "Промежуточный результат - " + result);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


                 phaser.arriveAndAwaitAdvance();

        Phaser_My.resultNew += result;

        System.out.println(" выполняет фазу " + phaser.getPhase() + "__" + Thread.currentThread().getName() + "Промежуточный результат - " + Phaser_My.resultNew);




        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                    phaser.arriveAndAwaitAdvance();



        System.out.println(" выполняет фазу " + phaser.getPhase() + "__" + Thread.currentThread().getName() + "Промежуточный результат - " + Phaser_My.resultNew);
                    phaser.arriveAndDeregister();


    }
}
