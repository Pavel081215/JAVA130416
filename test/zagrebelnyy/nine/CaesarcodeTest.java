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
        String encode = "ABC";
        String encode1 = "BCD";
        int key = 1;
        String resultat = Caesarcode.encode(encode, key);
        Assert.assertEquals(resultat, encode1);

    }

    @Test
    public void testDecode() throws Exception {
        String encode = "BCD";
        String encode1 = "ABC";
        int key = 1;
        String resultat = Caesarcode.decode(encode, key);
        Assert.assertEquals(resultat, encode1);

    }
}