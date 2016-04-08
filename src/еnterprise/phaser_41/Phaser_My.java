package еnterprise.phaser_41;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class Phaser_My implements SquareSum {

    final Phaser phaser = new Phaser(3);
    public static long resultNew = 0;
    private int step;
    List<Runnable> tasks = new ArrayList<>();
    private Computation computation = new Computation();

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) throws ArrayLessOfThreadNumberExceptions, InterruptedException {
        step = computation.calculationStepArray(values, numberOfThreads);
        int[] index = computation.arrayIndicesForDividingMainBody(values, numberOfThreads, step);
        for (int i = 0; i < numberOfThreads; i++) {
            int temp1 = index[i];
            int temp2 = index[i + 1];
            tasks.add(new Runnable() {
                @Override
                public void run() {
                    new Worker(phaser, values, temp1, temp2).run();
                }
            });
        }

        computation.runTasks(tasks);
        Thread.sleep(1000);
        return resultNew;
    }
}


