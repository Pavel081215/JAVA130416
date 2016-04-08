package еnterprise.phaser_41;

import java.util.concurrent.Phaser;

/**
 * Created by Pavel on 07.04.2016.
 */
public class Cheks {
    public static void main(String[] args) throws ArrayLessOfThreadNumberExceptions, InterruptedException {
        int [] x = {2,2,2,2};
        int y = 2;
        Phaser_My phaser_My = new Phaser_My();

       // phaser_My.phaser.register();

        System.out.println( "Cheks ==  до"  + Phaser_My.resultNew);

        phaser_My.getSquareSum(x,y);

        System.out.println( "Cheks == после "  + Phaser_My.resultNew);



    }

}
