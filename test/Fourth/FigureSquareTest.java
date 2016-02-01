package Fourth;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 01.02.2016.
 */
public class FigureSquareTest extends TestCase {

    @Test
    public void testTriangleSquare() throws Exception {
        float side = 1;
        float height = 2;
        float actual = (height * side) / 2;
        float expected = FigureSquare.triangleSquare(side, height);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testRectangleSquare() throws Exception {
        float a = 2;
        float b = 3;
        float actual = a * b;
        float expected = FigureSquare.rectangleSquare(a, b);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCircleSquare() throws Exception {
        float radius = 1;
        float pi = 3.14f;
        float actual = (radius * radius) * pi;
        float expected = FigureSquare.circleSquare(radius);
        Assert.assertEquals(expected, actual, 0);
    }
}