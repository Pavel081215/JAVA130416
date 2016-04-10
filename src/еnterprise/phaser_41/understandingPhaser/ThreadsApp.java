package еnterprise.phaser_41.understandingPhaser;
import java.util.concurrent.Phaser;

public class ThreadsApp {

    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread 2")).start();

        // ждем завершения фазы 0
       // int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + "phase" + " завершена"+ "__" + Thread.currentThread().getName());
        // ждем завершения фазы 1
       // phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + "phase" + " завершена"+ "__" + Thread.currentThread().getName());

        // ждем завершения фазы 2
       // phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + "phase" + " завершена"+ "__" + Thread.currentThread().getName());

        phaser.arriveAndDeregister();
    }
}

class PhaseThread implements Runnable{

    Phaser phaser;
    String name;

    PhaseThread(Phaser p, String n){

        this.phaser=p;
        this.name=n;
        phaser.register();
    }
    public void run(){

        System.out.println(name + " выполняет фазу " + phaser.getPhase()+ "__" + Thread.currentThread().getName());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что первая фаза достигнута

        System.out.println(name + " выполняет фазу " + phaser.getPhase()+ "__" + Thread.currentThread().getName());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что вторая фаза достигнута

        System.out.println(name + " выполняет фазу " + phaser.getPhase()+ "__" + Thread.currentThread().getName());
        phaser.arriveAndDeregister(); // сообщаем о завершении фаз и удаляем с регистрации объекты
    }
}