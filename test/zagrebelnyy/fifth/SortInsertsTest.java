package zagrebelnyy.fifth;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 01.02.2016.
 */
public class SortInsertsTest extends TestCase {

    @Test
    public void testInsertionSort() throws Exception {
        int[] arr = {2, 3, 5, 1};
        int[] actual = {1, 2, 3, 5};
        SortInserts.insertionSort(arr);

        Assert.assertArrayEquals(actual, arr);

    }

    @Test
    public void testInsertionSort2() throws Exception {
        int a = 3;
        int b = 4;
        int[] arr = {2, 3, 5, 1};
        int[] actual = {2, 3, 1, 5};
        SortInserts.insertionSort2(arr, a, b);

        Assert.assertArrayEquals(actual, arr);

    }
}