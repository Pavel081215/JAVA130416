package еnterprise.generics_2.test;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Pavel on 20.03.2016.
 */
public class Generics  extends TestCase {

    @Test
    public void testGenericsTypeSafe() throws Exception {
        List<Integer> ints = Arrays.asList(10, 20, 30);
        for (Integer anInt : ints) {
            System.out.println(anInt);
        }
    }
    @Test
    public void testGenericSubtypes() throws Exception {
        List<Number> numbers;
        List<Integer> integers = Arrays.asList(10, 20, 30);
        //numbers = integers;

    }
    @Test
    public void testArraysSubtype() throws Exception {
        Number[] number;
        Integer[] inteders = new Integer[] {10,20,30};
        number = inteders;
        //  number[2] =10.3;


    }
}
