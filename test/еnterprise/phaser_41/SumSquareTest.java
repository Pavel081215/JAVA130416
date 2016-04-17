package еnterprise.phaser_41;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SumSquareTest {

    private int[] x = {2, 2, 1, 1};
    private int y = 3;
    private long expected1 = 10;

    @BeforeClass
    void setUp() throws Exception {

    }


    @Test(invocationCount = 100, threadPoolSize = 1)

    public synchronized void testGetSquareSum1() throws Exception {
        SumSquare sumSquare1 = new SumSquare();
        long actual1 = sumSquare1.getSquareSum(x, y);
        Assert.assertEquals(expected1, actual1);

    }


}