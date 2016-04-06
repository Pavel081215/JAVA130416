package еnterprise.synchronize_3;

public class SemaphoreSynchronize implements SemaphoreMy {

    private int permitMy = 0;
    private final Object lock = new Object();
    private int countsAllPermits = 0;

    public SemaphoreSynchronize(int permitMy) {
        this.permitMy = permitMy;
    }

    // Запрашивает разрешение. Если есть свободное захватывает его. Если нет - приостанавливает поток до тех пор пока не появится свободное разрешение.
    @Override
    public void acquire() {
        synchronized (lock) {
            if ((permitMy - countsAllPermits) <= 0) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            countsAllPermits++;
        }
    }

    // Запрашивает переданое количество разрешений. Если есть переданое количество свободных разрешений захватывает их.
    // Если нет - приостанавливает поток до тех пор пока не появится переданое колтчество свободных разрешений.
    @Override
    public synchronized void acquire(int permit) {
        synchronized (lock) {
            permitMy = permit;
            if ((permitMy - countsAllPermits) <= 0) {
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
            lock.notify();
            countsAllPermits--;
        }
    }

    // Отпускает переданое количество разрешений возварщая их семафору.
    @Override
    public void release(int permits) {
        for (int i = 0; i < permits; i++) {
            synchronized (lock) {
                lock.notify();
                System.out.println("Отпустил " + Thread.currentThread().getName());
                countsAllPermits--;
            }
        }
    }

    // Возвращает количество свободных разрешений на данный момент.
    @Override
    public int getAvailablePermits() {
        return permitMy - countsAllPermits;
    }
}
