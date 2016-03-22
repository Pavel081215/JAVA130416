package еnterprise.synchronize;



public class LatchBootstrap {

    private CountDownLatch countDownLatch;

    public static void main(String[] args)  {
        new LatchBootstrap().test();
    }

    public void test() {
        countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new Worked()).start();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (countDownLatch.getCounter() > 0) {
                    countDownLatch.countDown();
                }
            }
        }).start();
    }


    public class Worked implements Runnable {

        @Override
        public void run() {

            try {
                System.out.println("Theard " + Thread.currentThread().getName() + " start waiting");
                countDownLatch.await();
                System.out.println("Theard " + Thread.currentThread().getName() + " stop  waiting");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
