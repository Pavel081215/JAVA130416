package еnterprise.reentrantLock_4;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.String.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by Pavel on 04.04.2016.
 */
public class ExecutoraExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new ExecutoraExample().testExecute();
        //new ExecutoraExample().testSubmit();
        //new ExecutoraExample().testException();
        //new ExecutoraExample().testInvokeAny();
       // new ExecutoraExample().testInvokeAll();
        //new ExecutoraExample().testScheduled();
        //new ExecutoraExample().testScheduledAtFixedRate();
    }

    public void testExecute() {
        Executor executor = Executors.newFixedThreadPool(12);
        System.out.println(Thread.currentThread().getName() + ":   submits  task ");
         for (int i =0; i < 7; i ++){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": Async task started ");
            }
        });
          }

    }

    public void testSubmit() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> f = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return " Task  executed ";
            }
        });
        System.out.println("Waiting  for result");
        System.out.println("result -" + f.get());
        Thread.sleep(10000);
        executorService.shutdownNow();

    }


    public void testException() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> f = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                throw new RuntimeException("Exception happen");
            }
        });
        System.out.println("Waiting  for result");
        Thread.sleep(1000);
        System.out.println("result -" + f.get());
        executorService.shutdownNow();

    }


    public void testInvokeAny() throws ExecutionException, InterruptedException {

        List<Callable<String>> callables = new ArrayList<>();
        Random random = new Random();
        IntStream.range(0, 3).forEach(i -> callables.add(() -> {
            Thread.sleep(random.nextInt(1000));
            return String.valueOf(i);
        }));


        ExecutorService executor = Executors.newCachedThreadPool();
        String result = executor.invokeAny(callables);

        System.out.println(result);
        executor.shutdown();
    }


    public void testInvokeAll() throws ExecutionException, InterruptedException {

        List<Callable<String>> callables = new ArrayList<>();
        Random random = new Random();
        IntStream.range(0, 3).forEach(i -> callables.add(() -> {
           // Thread.sleep(random.nextInt(1000));

            return String.valueOf(i);
        }));


        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<String>> result = executor.invokeAll(callables);

        for (Future f : result) {
            System.out.println(f.get());
        }
        executor.shutdown();
    }

    public void testScheduled() {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Task scheduled: " + new Date());
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task  Executed: " + new Date());
            }
        }, 1, TimeUnit.SECONDS);
    }


    public void testScheduledAtFixedRate() throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Task scheduled: " + new Date());
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task  Executed: " + new Date());
            }
        }, 1, 1, TimeUnit.SECONDS);
        Thread.sleep(10000);
        executorService.shutdown();
    }


}
