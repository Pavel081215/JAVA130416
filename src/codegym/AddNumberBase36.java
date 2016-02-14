package codegym;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pavel on 13.02.2016.
 */
public class AddNumberBase36 {
    public static void main(String[] args) {
        String a = "z";
        String b = "1";
        AddNumberBase36 addNumberBase36 = new AddNumberBase36();

        System.out.println(addNumberBase36.add(a, b));


    }


    public String add(String a, String b) {
        StringBuilder result = new StringBuilder();

        int aLength = a.length();
        int bLength = b.length();

        int tempMemory = 0;

        Map<Character, Integer> abc = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            abc.put((char) ('0' + i), i);
        }
        for (int i = 0; i < 26; i++) {
            abc.put((char) ('a' + i), i + 10);
            abc.put((char) ('A' + i), i + 10);
        }


        for (int i = 0; i < aLength || i < bLength; i++) {
            char aTemp = (i < aLength) ? a.charAt(aLength - 1 - i) : '0';

            char bTemp = (i < bLength) ? b.charAt(bLength - 1 - i) : '0';

            int sum = tempMemory + abc.get(aTemp) + abc.get(bTemp);

            if (sum < 36) {
                result.append(fromInt(sum));
                tempMemory = 0;
            } else {
                result.append(fromInt(sum % 36));
                tempMemory = 1;
            }
        }
        if (tempMemory == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }


    private char fromInt(int num) {
        if (num < 10) {
            return (char) ('0' + num);
        } else {
            return (char) ('a' + num - 10);
        }
    }

}
