package еnterprise.reentrantLock_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Pavel on 28.03.2016.
 */
public class ReadWriteLocks {


    public static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        ConcurrentArray<Integer> array = new ConcurrentArray<>(ARRAY_LENGTH);
        IntStream.range(0, 3).forEach((i) -> new Thread(() -> {
            while (true) {
                System.out.println("READING: " + Arrays.toString(array.read()));
            }
        }).start());
        new Thread(() -> {
            Random random = new Random();
            while (true) {
                // java 8
                Integer[] ints = Stream.generate(random::nextInt).limit(random.nextInt(ARRAY_LENGTH + 1)).toArray(Integer[]::new);
                // java 7
                /* int size = random.nextInt(ARRAY_LENGTH+1);
                ints = new Integer[size];
                for (   int i =0; i < size; i++){
                    ints[i] =random.nextInt();
                }*/

                array.write(ints, ARRAY_LENGTH - ints.length);
            }
        }).start();


    }


    public static class ConcurrentArray<T> {


        private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        private Object[] items;
        private Random random = new Random();

        public ConcurrentArray(int capacity) {
            items = new Object[capacity];
        }

        public void write(T[] value, int index) {
            readWriteLock.writeLock().lock();
            try {
                if (items.length < value.length + index) {
                }
                System.arraycopy(value, 0, items, index, value.length);
                Thread.sleep(random.nextInt(10000));
                System.out.println("WRITING_WRITING: " + Arrays.toString(items));


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }

        public T[] read() {
            readWriteLock.readLock().lock();
            try {
                Object[] result = Arrays.copyOf(items, items.length);
                Thread.sleep(random.nextInt(10));
                return (T[]) result;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                readWriteLock.readLock().unlock();
            }

        }
    }
}
