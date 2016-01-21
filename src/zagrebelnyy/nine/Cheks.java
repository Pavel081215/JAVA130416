package zagrebelnyy.nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Pavel on 21.01.2016.
 */
public class Cheks {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int key = alphabet.length+1;
        while (0 >= key || key >= alphabet.length) {
            final String keyInfo = "Введите ключ не больше 26";  // не больше алфавита
            System.out.println(keyInfo);
            key = Integer.parseInt(reader.readLine());
            System.out.println(key);
        }
        final String info = "Введите слово для шифрования";
        System.out.println(info);
        final String encodeWordStart = reader.readLine();
        char [] charArray = encodeWordStart.toCharArray();


        char [] encodeArray = new char [charArray.length];

        for (int i = 0; i < charArray.length; i ++){
            for (int j = 0; j < charArray.length; j ++){
                if(charArray[i] == alphabet [j]){
                    if( j+ key <= alphabet.length ){
                        encodeArray[i] = alphabet[j+key];
                    }else {
                        int temp = (j + key) - alphabet.length;
                        encodeArray[i] = alphabet[temp];
                    }

                }
            }
        }

       String encodeWordFinish;
      //  encodeWordFinish.toString(encodeWordFinish)

        StringBuilder.class.toString(encodeArray);


    }

}
