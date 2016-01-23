package zagrebelnyy.nine;

import zagrebelnyy.eight.Alphabet;


/**
 * Created by Pavel on 22.01.2016.
 */
public class Caesarcode {
    public static String encode(String encode, int key) throws Exception {
        final int mod = 26;
        final char[] alphabetSmall = Alphabet.alphabetsmall(mod);
        final char[] alphabetBig = Alphabet.alphabeBig(mod);
        key = key % mod;
        char[] charArray = encode.toCharArray();
        char[] encodeArray = new char[charArray.length];
        char space = ' ';
        char space1 = (char) 91;

        for (int i = 0; i < charArray.length; i++) {

            if (space != charArray[i] && space1 != charArray[i]) {
                if (!BigWordsTtue.bigSmallWords(charArray[i], mod)) {
                    for (int j = 0; j < alphabetSmall.length; j++) {
                        if (charArray[i] == alphabetSmall[j]) {
                            if (j + key < alphabetSmall.length) {
                                encodeArray[i] = alphabetSmall[j + key];
                            } else {
                                encodeArray[i] = alphabetSmall[(j + key) - mod];
                            }
                        }
                    }
                } else {
                    for (int j = 0; j < alphabetBig.length; j++) {
                        if (charArray[i] == alphabetBig[j]) {
                            if (j + key < alphabetBig.length) {
                                encodeArray[i] = alphabetBig[j + key];
                            } else {
                                encodeArray[i] = alphabetBig[(j + key) - mod];
                            }
                        }
                    }

                }

            }
        }
        return String.valueOf(encodeArray);
    }


    public static String decode(String decode, int key) throws Exception {
        final int mod = 26;
        final char[] alphabetSmall = Alphabet.alphabetsmall(mod);
        final char[] alphabetBig = Alphabet.alphabeBig(mod);
        key = key % mod;
        char[] charArray = decode.toCharArray();
        char[] decodeArray = new char[charArray.length];
        char space = ' ';
        char space1 = (char) 91;

        for (int i = 0; i < charArray.length; i++) {

            if (space != charArray[i] && space1 != charArray[i]) {
                if (!BigWordsTtue.bigSmallWords(charArray[i], mod)) {
                    for (int j = 0; j < alphabetSmall.length; j++) {
                        if (charArray[i] == alphabetSmall[j]) {
                            if (j - key < 0) {
                                decodeArray[i] = alphabetSmall[(j - key) + mod];
                            } else {
                                decodeArray[i] = alphabetSmall[j - key];

                            }
                        }
                    }
                } else {
                    for (int j = 0; j < alphabetBig.length; j++) {
                        if (charArray[i] == alphabetBig[j]) {
                            if (j - key < 0) {
                                decodeArray[i] = alphabetBig[(j - key) + mod];
                            } else {
                                decodeArray[i] = alphabetBig[j - key];

                            }
                        }
                    }
                }
            }

        }
        return String.valueOf(decodeArray);
    }
}
