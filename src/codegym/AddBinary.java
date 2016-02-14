package codegym;

/**
 * Created by Pavel on 13.02.2016.
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "101";
        String b = "100";

        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.add(a, b));
    }

    String add(String a, String b) {
        //for(int i=0; i < a.length(); i++)
        int i = 0;
        int aLength = a.length();
        int bLength = b.length();
        StringBuilder result = new StringBuilder();
        int tempMemory = 0;
        while (i < aLength || i < bLength) {
            char aTemp = (i < aLength) ? a.charAt(aLength - 1 - i) : '0';

            char bTemp = (i < bLength) ? b.charAt(bLength - 1 - i) : '0';

            int sum = (aTemp - '0') + (bTemp - '0') + tempMemory;

            if (sum == 0) {
                result.append('0');
                tempMemory = 0;
            } else if (sum == 1) {
                result.append('1');
                tempMemory = 0;
            } else if (sum == 2) {
                result.append('0');
                tempMemory = 1;
            } else if (sum == 3) {
                result.append('1');
                tempMemory = 1;
            }
            i++;
        }
        if (tempMemory == 1) result.append('1');
        result.reverse();
        return result.toString();
    }
}
