package zagrebelnyy.nine;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Pavel on 29.01.2016.
 */
public class CaesarcodeTest extends TestCase {

    @Test

    public void testEncode() throws Exception {
        String actual = "ABC";
        String expected = "BCD";
        int key = 1;
        String resultat = Caesarcode.encode(actual, key);
        Assert.assertEquals(resultat, expected);

    }

    @Test
    public void testDecode() throws Exception {
        String actual = "BCD";
        String expected = "ABC";
        int key = 1;
        String resultat = Caesarcode.decode(actual, key);
        Assert.assertEquals(resultat, expected);

    }
}