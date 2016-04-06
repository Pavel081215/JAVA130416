package еnterprise.synchronize_3;

/**
 * Created by Pavel on 24.03.2016.
 */
public class WorkerMy implements Runnable {

    private int indexes;

    public static void main(String[] args) {
        SemaphoreSynchronize semaphore = new SemaphoreSynchronize(0);

        for (int i = 0; i < 3; i++) {
            new Thread(new WorkerMy(i, semaphore)).start();
        }
    }


    private SemaphoreSynchronize semaphoreSynchronize;

    private WorkerMy(int indexes, SemaphoreSynchronize semaphoreSynchronize) {
        this.indexes = indexes;
        this.semaphoreSynchronize = semaphoreSynchronize;
    }


    @Override
    public void run() {
        System.out.println("Старт" + Thread.currentThread().getName());
        try {
            System.out.println("  Подошёл к семофору " + Thread.currentThread().getName());
            semaphoreSynchronize.acquire(1);
            System.out.println("Работает после семофора" + Thread.currentThread().getName());

            semaphoreSynchronize.release(1);
            System.out.println("Отпустил " + Thread.currentThread().getName());
            System.out.println("Количестов свободных" + semaphoreSynchronize.getAvailablePermits() + Thread.currentThread().getName());
            System.out.println("КОНЕЦ" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
