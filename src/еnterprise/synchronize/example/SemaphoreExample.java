package еnterprise.synchronize.example;
import java.util.concurrent.Semaphore;

/**
 * Created by Pavel on 23.03.2016.
 */
public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Worker(semaphore, "Adder", true).start();
        new Worker(semaphore, "Reducer", false).start();
    }
}
