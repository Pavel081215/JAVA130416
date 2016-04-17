package еnterprise.phaser_41;

import org.junit.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SumSquareTest {
    private SumSquare sumSquare1;
    private int[] x = {2, 2, 1, 1};
    private int y = 3;

    @BeforeClass
    void setUp() throws Exception {
        System.out.println("setUp");
        sumSquare1 = new SumSquare();

    }


    @Test(invocationCount = 5,  singleThreaded = true)

    public void testGetSquareSum1() throws Exception {
        SumSquare.resultNew = 0;
        System.out.println("testGetSquareSum1  = "  + SumSquare.resultNew);

        long expected1 = 10;
        System.out.println("expected1");
        long actual1 = sumSquare1.getSquareSum(x, y);
        System.out.println("actual1");
        Assert.assertEquals(expected1, actual1);
        System.out.println("Assert");
        System.out.println(SumSquare.resultNew);

    }


}