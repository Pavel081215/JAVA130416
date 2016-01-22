package zagrebelnyy.nine;

import zagrebelnyy.eight.Alphabet;


/**
 * Created by Pavel on 22.01.2016.
 */
public class Caesarcode {
    public static String encode(String encode, int key) throws Exception {
        final int mod = 26;
        final char[] alphabetSmall = Alphabet.alphabetsmall(mod);
        final char[] alphabetBig = Alphabet.alphabetsmall(mod);
        key = key % mod;
        char[] charArray = encode.toCharArray();
        char[] encodeArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            char space = ' ';
            char space1 = '[';
            if (space != charArray[i] || space1 != charArray[i] ) {
                if (BigWordsTtue.bigSmallWords(charArray[i], mod)) {
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
        final char[] alphabet = new char[mod];
        int k = 97;
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) k;
            k++;
        }
        key = key % mod;
        char[] charArray = decode.toCharArray();
        char[] decodeArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            char space = ' ';
            if (space != charArray[i]) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (charArray[i] == alphabet[j]) {
                        if (j - key < 0) {
                            decodeArray[i] = alphabet[(j - key) + mod];
                        } else {
                            decodeArray[i] = alphabet[j - key];

                        }
                    }
                }
            }
        }
        return String.valueOf(decodeArray);
    }
}
