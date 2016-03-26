package еnterprise.synchronize;

//import java.util.concurrent.Semaphore;

/**
 * Created by Pavel on 22.03.2016.
 */
public class SemaphoreSynchronize implements SemaphoreMy {

    private int permitMy = 0;
    private Object lock = new Object();
    private int countsAllPermits = 0;
    // private int countsPermits = 0;

    public SemaphoreSynchronize(int permitMy) {
        this.permitMy = permitMy;
    }


    // Запрашивает разрешение. Если есть свободное захватывает его. Если нет - приостанавливает поток до тех пор пока не появится свободное разрешение.
    @Override
    public void acquire() {
        synchronized (lock) {
            if (0 >= permitMy) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            permitMy--;
        }
        countsAllPermits++;
    }

    // Запрашивает переданое количество разрешений. Если есть переданое количество свободных разрешений захватывает их.
    // Если нет - приостанавливает поток до тех пор пока не появится переданое колтчество свободных разрешений.

    @Override
    public void acquire(int permits) {
        synchronized (lock) {
            if (0 >= permits) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            permits--;
        }
        countsAllPermits++;
    }

    // Отпускает разрешение возвращая его семафору.

    @Override
    public void release() {
        synchronized (lock) {
            lock.notify();
            countsAllPermits++;
        }
    }

    // Отпускает переданое количество разрешений возварщая их семафору.
    @Override
    public void release(int permits) {
        synchronized (lock) {
            if (0 >= permits) {
                lock.notify();
                permits--;
                countsAllPermits++;
            }
        }

    }

    // Возвращает количество свободных разрешений на данный момент.
    @Override
    public int getAvailablePermits() {
        return  countsAllPermits;


    }
}
