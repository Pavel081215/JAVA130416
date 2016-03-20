package ånterprise.generics;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 20.03.2016.
 */
public class LongTaskTest extends TestCase {

    @Test
    public void testExecute() throws Exception {
        LongTask longTask = new LongTask(1l);

        long actual = 2l;
        longTask.execute();

        // Assert.assertEquals(expected, actual, 0);


        Assert.assertEquals(longTask.execute(), actual);
    }

    @Test
    public void testGetResult() throws Exception {

    }
}