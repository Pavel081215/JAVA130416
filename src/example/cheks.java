package example;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Pavel on 30.03.2016.
 */
public class Cheks {
    public static void main(String[] args) throws InterruptedException {
        GregorianCalendar calendar = new GregorianCalendar();
        Date hipeDay = calendar.getTime();
        System.out.println(hipeDay);
        Thread.sleep(1000);

        for (int i =0; i < 10; i++){
            System.out.println("111" + new GregorianCalendar().getTime());
            Thread.sleep(1000);
        }
    }
}
