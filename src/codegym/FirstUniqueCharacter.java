package codegym;

/**
 * Created by Pavel on 07.02.2016.
 */
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(FirstUniqueCharacter.find("fgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfw"));
    }


    public static Character find(String s) {

        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {
            int counter = -1;
            for (int j = 0; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    counter++;
                }
            }

            if (counter == 0) {
                return ch[i];

            }


        }
        return null;
    }
}
