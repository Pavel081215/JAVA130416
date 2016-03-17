package generics;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GenericsTypeInRunTime  extends TestCase{

    @Test
    public void testName() throws Exception {
        List<Integer> ints = Arrays.asList(10,20,30);
        List objects = Arrays.asList(10,20,30);


    }
}
