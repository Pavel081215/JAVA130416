package еnterprise.synchronize;

import java.util.concurrent.Semaphore;

/**
 * Created by Pavel on 22.03.2016.
 */
public class SemaphoreSynchronize implements SemaphoreMy {

    Semaphore semaphore;

    public SemaphoreSynchronize(Semaphore semaphore) {
        this.semaphore = semaphore;
    }



    // Запрашивает разрешение. Если есть свободное захватывает его. Если нет - приостанавливает поток до тех пор пока не появится свободное разрешение.
    @Override
    public void acquire() {
        try {
            semaphore.acquire();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Запрашивает переданое количество разрешений. Если есть переданое количество свободных разрешений захватывает их.

    // Если нет - приостанавливает поток до тех пор пока не появится переданое колтчество свободных разрешений.
    @Override
    public void acquire(int permits) {
        try {
            semaphore.acquire(permits);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Отпускает разрешение возвращая его семафору.
    @Override
    public void release() {
        semaphore.release();

    }

    // Отпускает переданое количество разрешений возварщая их семафору.
    @Override
    public void release(int permits) {
        semaphore.release(permits);

    }


    // Возвращает количество свободных разрешений на данный момент.
    @Override
    public int getAvailablePermits() {
        return semaphore.availablePermits();


    }
}
