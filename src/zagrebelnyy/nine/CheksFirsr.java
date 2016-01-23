package zagrebelnyy.nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Pavel on 21.01.2016.
 */
public class CheksFirsr {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final char[] alphabet = new char[26];
        int k = 97;
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) k;
            k++;
        }
        int key = alphabet.length + 1;
        while (0 >= key || key > alphabet.length) {
            final String keyInfo = "Введите ключ не больше 26 ( 26 количество букв в английском алфавите)";
            System.out.println(keyInfo);
            key = Integer.parseInt(reader.readLine());
        }
        final String info = "Введите слово для шифрования, английскими маленькими буквами";
        System.out.println(info);
        final String encodeWordStart = reader.readLine();
        char[] charArray = encodeWordStart.toCharArray();

        char[] encodeArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            char space = ' ';
            if (space != charArray[i]) {


                for (int j = 0; j < alphabet.length; j++) {
                    if (charArray[i] == alphabet[j]) {
                        if (j + key < alphabet.length) {
                            encodeArray[i] = alphabet[j + key];
                        } else {
                            int temp = (j + key) - alphabet.length;
                            encodeArray[i] = alphabet[temp];
                        }
                    }
                }
            }
        }
        String encodeWordFinish = String.valueOf(encodeArray);
        String infoFinish = "Закодированное слово";
        System.out.println(infoFinish);
        System.out.println(encodeWordFinish);


    }

}
