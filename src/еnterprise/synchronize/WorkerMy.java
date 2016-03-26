package еnterprise.synchronize;

/**
 * Created by Pavel on 24.03.2016.
 */
public class WorkerMy implements Runnable {


    public static void main(String[] args) {
        SemaphoreSynchronize semaphoreSynchronize = new SemaphoreSynchronize(1);

        for (int i = 1; i <=100; i++) {
            new Thread(new WorkerMy(i,new SemaphoreSynchronize (1) )).start();
        }
    }



    int indecs;
    SemaphoreSynchronize semaphoreSynchronize;

    public WorkerMy(int indecs, SemaphoreSynchronize semaphoreSynchronize) {
        this.indecs = indecs;
        this.semaphoreSynchronize = semaphoreSynchronize;
    }

    public WorkerMy(SemaphoreSynchronize semaphoreSynchronize) {


    }


    @Override
    public void run() {
        System.out.println("№1Старт" + indecs);
      /*  try {
            System.out.println("№2Стоп" + indecs);
            semaphoreSynchronize.acquire();
            System.out.println("№3Работает" + indecs);
            System.out.println("№4Отпускаем" + indecs);
            semaphoreSynchronize.release();



            System.out.println("№8Количестов свободных" + indecs);
            semaphoreSynchronize.getAvailablePermits();
            System.out.println("№9КОНЕЦ");



        } catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println("№1Старт + второй блок" + indecs);
        try {


            System.out.println("№5Стоп (2 потока)" + indecs);
            semaphoreSynchronize.acquire(11);
            System.out.println("№6Работает (2 потока)" + indecs);
            System.out.println("№7Отпускаем(2 потока)" + indecs);
            semaphoreSynchronize.release(10);

            System.out.println("№8Количестов свободных" + semaphoreSynchronize.getAvailablePermits());

            System.out.println("№9КОНЕЦ");



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
