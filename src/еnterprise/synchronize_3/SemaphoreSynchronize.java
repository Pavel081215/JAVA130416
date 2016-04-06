package еnterprise.synchronize_3;


public class SemaphoreSynchronize implements SemaphoreMy {

    private int permitMy = 0;
    private final Object lock = new Object();
    private int countsAllPermits = 0;
    // private int countsPermits = 0;

    public SemaphoreSynchronize(int permitMy) {
        this.permitMy = permitMy;
    }


    // Запрашивает разрешение. Если есть свободное захватывает его. Если нет - приостанавливает поток до тех пор пока не появится свободное разрешение.
    @Override
    public void acquire() {
        permitMy = permitMy - countsAllPermits;
        synchronized (lock) {
            if (0 >= permitMy) {
                try {
                    countsAllPermits++;
                    lock.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //permitMy--;
        }

    }

    // Запрашивает переданое количество разрешений. Если есть переданое количество свободных разрешений захватывает их.
    // Если нет - приостанавливает поток до тех пор пока не появится переданое колтчество свободных разрешений.

    @Override
    public synchronized void acquire(int permit) {
        synchronized (lock) {
            if (countsAllPermits >= (permit - countsAllPermits)) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            countsAllPermits++;
        }
    }

    // Отпускает разрешение возвращая его семафору.

    @Override
    public void release() {
        synchronized (lock) {
            countsAllPermits--;
            lock.notify();
        }
    }

    // Отпускает переданое количество разрешений возварщая их семафору.
    @Override
    public void release(int permits) {
        synchronized (lock) {
            for (int i = 0; i < permits; i++) {
                countsAllPermits--;
                lock.notify();
            }
        }
    }

    // Возвращает количество свободных разрешений на данный момент.
    @Override
    public int getAvailablePermits() {
        return countsAllPermits;

    }
}
