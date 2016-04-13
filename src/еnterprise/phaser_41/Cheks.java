package еnterprise.phaser_41;

public class Cheks {
    public static void main(String[] args) throws ArrayLessOfThreadNumberExceptions, InterruptedException {
        int [] x = {2,2,1,1};
        int y = 3;

        Phaser_My phaser_My = new Phaser_My();

        phaser_My.getSquareSum(x,y);


        System.out.println(Phaser_My.resultNew);



    }

}
