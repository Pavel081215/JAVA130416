package zagrebelnyy.fifth;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 01.02.2016.
 */
public class SortBubbleTest extends TestCase {

    @Test
    public void testBubbleSortFirst() throws Exception {
        int[] arr = {2, 3, 5, 1};
        int[] expected = {1, 2, 3, 5};
        SortBubble.bubbleSortFirst(arr);

        Assert.assertArrayEquals(expected, arr);


    }

    @Test
    public void testBubbleSortSecond() throws Exception {
        int[] arr = {2, 3, 5, 1};
        int[] actual = {5, 3, 2, 1};
        int[] expected = SortBubble.bubbleSortSecond(arr);

        Assert.assertArrayEquals(expected, actual);

    }
}