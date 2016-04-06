package еnterprise.reentrantLock_4;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.stream.IntStream;

/**
 * Created by Pavel on 04.04.2016.
 */
public class Synchronizers {
    public static void main(String[] args) throws InterruptedException {
        Synchronizers synchronizers = new Synchronizers();
        synchronizers.testExchanger();

    }


    public void testCiclicBarrier() throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5, () -> System.out.println("Barrier  exceeded"));
        while (true) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "Start waiting");
                    barrier.await();
                    System.out.println(Thread.currentThread().getName() + "finish waiting ");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
            Thread.sleep(1000);
        }
    }


    public void testExchanger() {
        Exchanger<String> exchanger = new Exchanger<>();

        IntStream.range(0, 2).forEach((i) -> new Thread(() -> {
            try {

                Thread.sleep(new Random().nextInt(1000));
                String name = Thread.currentThread().getName();
                System.out.println(name + " ready to exchange ");
                System.out.println(name + "< - >" + exchanger.exchange(name));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }).start());
    }

}
