package еnterprise.phaser_41;

public class Cheks {
    public static void main(String[] args) throws ArrayLessOfThreadNumberExceptions, InterruptedException {
        int[] x = {2, 2, 1, 1};
        int y = 3;

        SumSquare phaser_My = new SumSquare();

        phaser_My.getSquareSum(x, y);




        System.out.println(SumSquare.resultNew);




    }


}
