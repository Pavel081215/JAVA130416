package еnterprise.phaser_41;


public class Worker implements Runnable{
    private Computation computation = new Computation();

    private int[] array;


    public Worker(int[] array, int pointStart, int pointFinsh) {

        this.array = array;
        this.pointStart = pointStart;
        this.pointFinish = pointFinsh;
    }

    private int pointStart;
    private int pointFinish;
    public static long result;


    public void run() {
        System.out.println(Thread.currentThread().getName() + "Worker");
        Phaser_My.resultNew += computation.squareValuesArray(array, pointStart, pointFinish);

    }
}
