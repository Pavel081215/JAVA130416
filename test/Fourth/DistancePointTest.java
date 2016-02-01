package Fourth;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static Fourth.DistancePoint.distancePointCoordinates;
import static org.junit.Assert.*;

/**
 * Created by Pavel on 01.02.2016.
 */
public class DistancePointTest extends TestCase {

    @Test
    public void testDistancePointCoordinates() throws Exception {
        float ax = 43;
        float ay = 44;
        float bx = 32;
        float by = 44;
        double actual = Math.sqrt((bx - ax) * (bx - ax)) + ((by - ay) * (by - ay));
        double expected = DistancePoint.distancePointCoordinates(ax, ay, bx, by);


        Assert.assertEquals(expected, actual, 0);

    }
}