package zagrebelnyy.nine;

import zagrebelnyy.eight.Alphabet;

import java.io.IOException;


/**
 * Created by Pavel on 22.01.2016.
 */
public class Caesarcode {
    final static int numberOfLettersInEnglishAlphabet = 26;


    public static String encode(String encode, int key) throws IOException {
        char[] alphabetWorking;
        key = key % numberOfLettersInEnglishAlphabet;
        char[] charArray = encode.toCharArray();
        char[] encodeArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (Letters.checkIsCharAlphbetOrNotAlphbet(charArray[i], numberOfLettersInEnglishAlphabet)) {
                for (int j = 0; j < charArray.length; j++) {
                    if (!Letters.checkIsLettersLarge(charArray[i], numberOfLettersInEnglishAlphabet)) {
                        alphabetWorking = Alphabet.alphabetsmall(numberOfLettersInEnglishAlphabet);
                    } else {
                        alphabetWorking = Alphabet.alphabeBig(numberOfLettersInEnglishAlphabet);
                    }
                    if (charArray[i] == alphabetWorking[j]) {
                        if ((j + key) >= numberOfLettersInEnglishAlphabet) {
                            encodeArray[i] = alphabetWorking[(j + key) - numberOfLettersInEnglishAlphabet];
                        } else {
                            encodeArray[i] = alphabetWorking[j + key];
                        }
                    }
                }
            } else {
                encodeArray[i] = charArray[i];
            }
        }
        return String.valueOf(encodeArray);
    }


    public static String decode(String encode, int key) throws IOException {
        char[] alphabetWorking;
        key = key % numberOfLettersInEnglishAlphabet;
        char[] charArray = encode.toCharArray();
        char[] encodeArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (Letters.checkIsCharAlphbetOrNotAlphbet(charArray[i], numberOfLettersInEnglishAlphabet)) {
                for (int j = 0; j < charArray.length; j++) {
                    if (!Letters.checkIsLettersLarge(charArray[i], numberOfLettersInEnglishAlphabet)) {
                        alphabetWorking = Alphabet.alphabetsmall(numberOfLettersInEnglishAlphabet);
                    } else {
                        alphabetWorking = Alphabet.alphabeBig(numberOfLettersInEnglishAlphabet);
                    }
                    if (charArray[i] == alphabetWorking[j]) {
                        if ((j - key) < 0) {
                            encodeArray[i] = alphabetWorking[(j - key) + numberOfLettersInEnglishAlphabet];
                        } else {
                            encodeArray[i] = alphabetWorking[j - key];
                        }
                    }
                }
            } else {
                encodeArray[i] = charArray[i];
            }
        }
        return String.valueOf(encodeArray);
    }


}
