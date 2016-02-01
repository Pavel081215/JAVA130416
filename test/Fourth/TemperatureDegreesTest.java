package Fourth;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 01.02.2016.
 */
public class TemperatureDegreesTest extends TestCase {

    @Test
    public void testCelsiusFahrenhei() throws Exception {
        float degrees = 1;
        float actual = 32.0f + ((9f / 5f) * degrees);
        float expected = TemperatureDegrees.celsiusFahrenhei(degrees);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testFahrenheitCelsius() throws Exception {
        float degrees = 1;
        float actual = ((5f / 9f) * degrees) - 32.0f;
        float expected = TemperatureDegrees.fahrenheitCelsius(degrees);
        Assert.assertEquals(expected, actual, 0);


    }
}