package zagrebelnyy.nine;

import org.junit.Assert;
import org.junit.Test;
import zagrebelnyy.eight.Alphabet;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 30.01.2016.
 */
public class LettersTest {

    final static int numberOfLettersInEnglishAlphabet = 26;


    @Test
    public void testCheckIsLettersLarge() throws Exception {
        char alphabe= 'd';
        boolean resultat = Letters.checkIsLettersLarge(alphabe, numberOfLettersInEnglishAlphabet);
        Assert.assertTrue  (resultat);

    }

    @Test
    public void testCheckIsCharAlphbetr() throws Exception {


    }
}