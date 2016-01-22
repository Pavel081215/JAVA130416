package zagrebelnyy.nine;

import zagrebelnyy.eight.Alphabet;

/**
 * Created by Pavel on 22.01.2016.
 */
public class BigWordsTtue {
    public static boolean bigSmallWords(char word, int mod) {
        boolean bigSmallWords;
        char[] alphabeBig = Alphabet.alphabeBig(mod);
        for (int i = 0; i < alphabeBig.length; i++) {
            if ( word == alphabeBig[i] ) {
                bigSmallWords = true;
                break;
            }
        }
        bigSmallWords = false;
        return bigSmallWords;
    }
}
