package zagrebelnyy.nine;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import zagrebelnyy.eight.Alphabet;

import static org.junit.Assert.*;
import static zagrebelnyy.nine.Letters.checkIsCharAlphbetr;
import static zagrebelnyy.nine.Letters.checkIsLettersLarge;

/**
 * Created by Pavel on 30.01.2016.
 */
public class LettersTest extends TestCase {

    final static int numberOfLettersInEnglishAlphabet = 26;


    @Test
    public void testCheckIsLettersLarge() throws Exception {
        char alphabe = 'D';

        Assert.assertTrue(checkIsLettersLarge(alphabe, numberOfLettersInEnglishAlphabet));

    }

    @Test
    public void testCheckIsCharAlphbetr() throws Exception {
        char alphabe = ' ';
        Assert.assertFalse(checkIsCharAlphbetr(alphabe, numberOfLettersInEnglishAlphabet));

    }
}