package zagrebelnyy.nine;

import zagrebelnyy.eight.Alphabet;

/**
 * Created by Pavel on 22.01.2016.
 */
public class LettersLargeOrSmall {
    public static boolean checkIsLettersLargeOrSmall(char word, int mod) {
        boolean bigSmallWords = false;
        char[] alphabeBig = Alphabet.alphabeBig(mod);
        for (int i = 0; i < alphabeBig.length; i++) {
            if (word == alphabeBig[i]) {
                bigSmallWords = true;
                break;
            }
        }

        return bigSmallWords;
    }
}
