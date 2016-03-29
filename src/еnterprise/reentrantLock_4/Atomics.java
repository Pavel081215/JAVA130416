package еnterprise.reentrantLock_4;

import еnterprise.synchronize_3.SynchronizedExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Pavel on 29.03.2016.
 */
public class Atomics {
    public static void main(String[] args) throws Exception {
        new Atomics().test();
    }

    private static AtomicInteger counter = new AtomicInteger(0);

    public void test() throws Exception {
        List<Aggregator> aggregators = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Aggregator aggregator = new Aggregator();
            aggregators.add(aggregator);
            new Thread(aggregator).start();
        }
        Thread.sleep(10);
        boolean isValid = true;
        Set<Integer> integerSet = new HashSet<>();
        for (Aggregator aggregator : aggregators) {
            for (Integer anInt : aggregator.ints) {
                if (!integerSet.add(anInt)) {
                    System.out.println("Error, duplicate found:  " + anInt);
                    isValid = false;
                }
            }
        }
        if (isValid) {
            System.out.println(" No duplicates  ");
        }
    }

    public class Aggregator implements Runnable {
        private List<Integer> ints = new ArrayList<>();

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {

                ints.add(increment());
            }
        }
    }

    public static  int increment() {

        return counter.incrementAndGet();

    }

}
