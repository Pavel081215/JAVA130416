package zagrebelnyy.fifth;

import Fourth.DistancePoint;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 01.02.2016.
 */
public class GetMaxMinTest extends TestCase {

    @Test
    public void testGetMax() throws Exception {
        int[] a = {1, 2, 3};
        int actual = 3;
        int expected = GetMaxMin.getMax(a);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testGetMin() throws Exception {
        int[] a = {1, 2, 3};
        int actual = 1;
        int expected = GetMaxMin.getMin(a);

        Assert.assertEquals(expected, actual, 0);

    }
}