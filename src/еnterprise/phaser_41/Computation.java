package еnterprise.phaser_41;


import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class Computation {

    public long squareValuesArray(int[] values, int start, int finish) {
        long result = 0;
        for (int i = start; i < finish; i++) {
            long valuesFirst = (long) values[i];
            result = result + (valuesFirst * valuesFirst);
        }
        System.out.println(Thread.currentThread().getName() + ": Async task started ");
        return result;
    }

    public int[] arrayIndicesForDividingMainBody(int[] values, int numberOfThreads, int step) throws ArrayLessOfThreadNumberExceptions {
        int[] index = new int[numberOfThreads + 1];
        if (values.length >= numberOfThreads) {
            index[0] = 0;
            index[index.length - 1] = values.length;
            if (index.length > 2) {
                int temp = values.length % numberOfThreads;
                index[index.length - 2] = values.length - (step + temp);
                for (int i = (index.length - 3); i > 0; i--) {
                    index[i] = index[i + 1] - step;
                }
            }
        } else {
            throw new ArrayLessOfThreadNumberExceptions();
        }
        return index;
    }

    public int calculationStepArray(int[] values, int numberOfThreads) {
        int temp = values.length % numberOfThreads;
        return (values.length - temp) / numberOfThreads;
    }


    public void runTasks(List<Runnable> tasks, Phaser phasert) throws InterruptedException {
        Executor executors = Executors.newFixedThreadPool(10);
        System.out.println("файзер1");
        for (final Runnable task : tasks) {
            phasert.register();
            new Thread() {
                public void run() {
                    do {
                        phasert.arriveAndAwaitAdvance();
                        System.out.println("файзер3");
                        executors.execute(task);
                        System.out.println("файзер4");
                    } while (!phasert.isTerminated());
                }
            }.start();
            Thread.sleep(500);
        }

        phasert.arriveAndDeregister();


    }


}
