package codegym;

import java.util.ArrayList;
import java.util.List;


public class ReversePolishNotation {
    public static void main(String[] args) {
        String inf = "1 3 2 * +";
        System.out.println(ReversePolishNotation.evaluate(inf));
    }

    public static int evaluate(String expression) {

        ArrayList<Character> charvarible = new ArrayList<Character>();
        ArrayList<Integer> varible = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            charvarible.add(expression.charAt(i));
        }

        int count = 0;
        int temp = 0;
        int resolt = 0;

        for (int i = 0; i < charvarible.size(); i++) {

            if (charvarible.get(i) != ' ') {
                if (charvarible.get(i) == '-') {
                    temp = varible.get(varible.size() - 2) - varible.get(varible.size() - 1);
                    varible.remove(varible.size() - 1);
                    varible.remove(varible.size() - 1);
                    varible.add(temp);
                } else if (charvarible.get(i) == '+') {
                    temp = varible.get(varible.size() - 1) + varible.get(varible.size() - 2);
                    varible.remove(varible.size() - 1);
                    varible.remove(varible.size() - 1);
                    varible.add(temp);
                } else if (charvarible.get(i) == '/') {
                    temp = varible.get(varible.size() - 2) / varible.get(varible.size() - 1);
                    varible.remove(varible.size() - 1);
                    varible.remove(varible.size() - 1);
                    varible.add(temp);
                } else if (charvarible.get(i) == '*') {
                    temp = varible.get(varible.size() - 1) * varible.get(varible.size() - 2);
                    varible.remove(varible.size() - 1);
                    varible.remove(varible.size() - 1);
                    varible.add(temp);
                } else {
                    int tempNumber = charvarible.get(i) - '0';
                    varible.add(tempNumber);
                    count++;
                }
            } else {
                for (int j = 0; j < count; j++) {
                    resolt = resolt * 10;
                    resolt += varible.get(varible.size() - (count -j));
                    varible.remove(varible.size() - (count -j));

                }
                if (count != 0){
                varible.add(resolt);}
                count = 0;
                resolt = 0;
             }
        }
        return  varible.get(0);
    }


}
