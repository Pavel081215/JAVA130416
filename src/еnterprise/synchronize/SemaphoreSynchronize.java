package еnterprise.synchronize;

/**
 * Created by Pavel on 22.03.2016.
 */
public class SemaphoreSynchronize implements Semaphore {

    private final Object lock = new Object();
    private int counter = 0;
    private int permitsInClass = 0;

    @Override

    // Запрашивает разрешение. Если есть свободное захватывает его. Если нет - приостанавливает поток до тех пор пока не появится свободное разрешение.

    public void acquire() {
        synchronized (lock) {
            try {
                System.out.println("Theard " + Thread.currentThread().getName() + " start waiting");
                lock.wait();
                System.out.println("Theard " + Thread.currentThread().getName() + " stop  waiting");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // Запрашивает переданое количество разрешений. Если есть переданое количество свободных разрешений захватывает их.

    // Если нет - приостанавливает поток до тех пор пока не появится переданое колтчество свободных разрешений.
    @Override
    public void acquire(int permits) {
        synchronized (lock) {
            if (counter <= permits) {
                try {
                    lock.wait();
                    counter++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Отпускает разрешение возвращая его семафору.
    @Override
    public void release() {
        lock.notifyAll();
    }

    // Отпускает переданое количество разрешений возварщая их семафору.
    @Override
    public void release(int permits) {
        synchronized (lock) {
            for (int i = 0; i < permits; i++) {
                lock.notify();
                permitsInClass++;

            }
        }
    }


    // Возвращает количество свободных разрешений на данный момент.
    @Override
    public int getAvailablePermits() {
        return permitsInClass - counter;
    }
}
