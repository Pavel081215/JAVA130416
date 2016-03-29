package еnterprise.synchronize_3;


import java.util.Random;

public class DeadLock {

    private static Random random = new Random();
    private static Account account1 = new Account(100L, 1);
    private static Account account2 = new Account(200L, 2);

    public static void main(String[] args) {
        new Thread(new Worker()).start();
        new Thread(new Worker()).start();
    }


    public static void transfer(Account source, Account target, long amount) {
        Account a1 = source.compareTo(target) > 0 ? source : target;
        Account a2 = source.compareTo(target) < 0 ? source : target;


        synchronized (a1) {
            synchronized (a2) {
                if (source.getBalance() >= amount) {
                    source.withdraw(amount);
                    target.put(amount);
                    System.out.println("Transfer:" + amount);
                } else {
                    System.out.println("Not enough money");
                }
            }
        }
    }

    public static class Worker implements Runnable {

        @Override
        public void run() {
            while (true) {
                if (random.nextBoolean()) {
                    transfer(account1, account2, random.nextInt(10));
                } else {
                    transfer(account2, account1, random.nextInt(10));
                }
            }
        }
    }

    public static class Account implements Comparable<Account> {
        private long balance;
        private int id;

        public Account(long balance, int id) {
            this.balance = balance;
            this.id = id;
        }

        public Account(long balance) {

            this.balance = balance;
        }

        public void put(long amount) {
            balance += amount;
        }

        public void withdraw(long amount) {
            balance -= amount;
        }

        public long getBalance() {
            return balance;
        }

        public long getId() {
            return id;
        }

        @Override
        public int compareTo(Account o) {
            return id - o.id;
        }
    }

}
