package еnterprise.phaser_41;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class SumSquare implements SquareSum {


    public volatile static long resultNew = 0;
    private int step;
    private List<Worker> tasks = new ArrayList<>();
    private Computation computation = new Computation();

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) throws ArrayLessOfThreadNumberExceptions, InterruptedException {
        resultNew = 0;
        final Phaser phaser = new Phaser(numberOfThreads+1);
        step = computation.calculationStepArray(values, numberOfThreads);
        int[] index = computation.arrayIndicesForDividingMainBody(values, numberOfThreads, step);
        for (int i = 0; i < numberOfThreads; i++) {
            int temp1 = index[i];
            int temp2 = index[i + 1];
            tasks.add(new Worker(phaser, values, temp1, temp2));
        }

        computation.runTasks(tasks);
        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndDeregister();


        return resultNew;
    }
}


