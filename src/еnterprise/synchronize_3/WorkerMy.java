package еnterprise.synchronize_3;

/**
 * Created by Pavel on 24.03.2016.
 */
public class WorkerMy implements Runnable {

    public static void main(String[] args) {
        SemaphoreSynchronize semaphore = new SemaphoreSynchronize(1);

        for (int i = 0; i <1000; i++) {
            new Thread(new WorkerMy(semaphore)).start();
        }
    }

    private SemaphoreSynchronize semaphoreSynchronize;

    private WorkerMy(SemaphoreSynchronize semaphoreSynchronize) {
        this.semaphoreSynchronize = semaphoreSynchronize;
    }

    @Override
   /* public void run() {
        System.out.println("Старт" + Thread.currentThread().getName());
        try {
            System.out.println("  Подошёл к семофору " + Thread.currentThread().getName());
            semaphoreSynchronize.acquire(1);
            System.out.println("Работает после семофора" + Thread.currentThread().getName());
            Thread.sleep(50);
            semaphoreSynchronize.release(2);
            System.out.println("Отпустил " + Thread.currentThread().getName());
            System.out.println("Количестов свободных" + semaphoreSynchronize.getAvailablePermits());
            System.out.println("КОНЕЦ" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
    public void run() {
        semaphoreSynchronize.acquire();
        counter++;
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
        semaphoreSynchronize.release();
    }
     static int counter = 0;
}
