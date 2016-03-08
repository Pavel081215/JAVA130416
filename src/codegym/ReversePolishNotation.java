package codegym;

import java.util.ArrayList;

/**
 * Created by Pavel on 29.02.2016.
 */
public class ReversePolishNotation {
    public static void main(String[] args) {

        String inf = "12 234*10 5/+*+";


        System.out.println(ReversePolishNotation.evaluate(inf));


    }


    public static int evaluate(String expression) {
        int temp = 0;

        ArrayList<Integer> varibleArray = new ArrayList();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {

                temp = varibleArray.get(varibleArray.size() - 1) + varibleArray.get(varibleArray.size() - 2);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.add(temp);

            } else if (expression.charAt(i) == '-') {
                temp = varibleArray.get(varibleArray.size() - 2) - varibleArray.get(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.add(temp);
            } else if (expression.charAt(i) == '*') {
                temp = varibleArray.get(varibleArray.size() - 1) * varibleArray.get(varibleArray.size() - 2);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.add(temp);
            } else if (expression.charAt(i) == '/') {
                temp = varibleArray.get(varibleArray.size() - 2) / varibleArray.get(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.add(temp);
            } else if (expression.charAt(i) == ' ') {
                temp = (varibleArray.get(varibleArray.size() - 2)*10)+ varibleArray.get(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.remove(varibleArray.size() - 1);
                varibleArray.add(temp);}
            else {
                 temp = expression.charAt(i) - '0';
                varibleArray.add(temp);
            }


        }
        return varibleArray.get(0);
    }

}
