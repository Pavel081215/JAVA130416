package codegym;

/**
 * Created by Pavel on 07.02.2016.
 */
public class AbcNumber {
    public int convert(String num) {

        char[] ch = new char[num.length()];
        int temp = 0;
        for (int i = 0; i < num.length(); i++) {
            ch[i] = num.charAt(i);
            temp += ch[i] - 'a';
            temp = temp * 10;
        }

        return temp;

    }


}
