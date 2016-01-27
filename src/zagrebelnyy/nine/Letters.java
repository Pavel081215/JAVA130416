package zagrebelnyy.nine;

import zagrebelnyy.eight.Alphabet;

/**
 * Created by Pavel on 22.01.2016.
 */
public class Letters {
    public static boolean checkIsLettersLarge(char letter, int numberOfLettersInEnglishAlphabet) {
        boolean bigLetter = false;
        char[] alphabeBig = Alphabet.alphabeBig(numberOfLettersInEnglishAlphabet);
        for (int i = 0; i < alphabeBig.length; i++) {
            if (letter == alphabeBig[i]) {
                bigLetter = true;
                break;
            }
        }

        return bigLetter;
    }

    public static boolean checkIsCharAlphbetr(char symbol, int numberOfLettersInEnglishAlphabet) {
        boolean alphbetrOfLetter = false;
        final int numberOfLettersInEnglishBigAndSmall = 52;
        char[] alphabeBig = Alphabet.alphabeBig(numberOfLettersInEnglishAlphabet);
        char[] alphabeSmall = Alphabet.alphabetsmall(numberOfLettersInEnglishAlphabet);
        char Alphbetr[] = new char[numberOfLettersInEnglishBigAndSmall];
        for (int i = 0; i < alphabeBig.length; i++) {
            Alphbetr[i] = alphabeBig[i];
        }
        for (int i = 0; i < alphabeSmall.length; i++) {
            Alphbetr[i + numberOfLettersInEnglishAlphabet] = alphabeSmall[i];
        }
        for (int j = 0; j < Alphbetr.length; j++) {
            if (symbol == Alphbetr[j]) {
                alphbetrOfLetter = true;
                break;
            }
        }
        return alphbetrOfLetter;
    }

}
