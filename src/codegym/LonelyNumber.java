package codegym;

/**
 * Created by Pavel on 10.02.2016.
 */
public class LonelyNumber {

    public static void main(String[] args) {

        int[] temp1 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6,7};

        System.out.println(LonelyNumber.find(temp1));


    }

    public static int find(int[] input) {
        int[] sum = new int[32];
        for (int i = 0; i < input.length; i++) {
            int number = input[i];
            for (int j = 0; j < 32; j++) {
                int mask = 1 << 1;
                if ((number & mask) == 1) {
                    sum[j] += 1;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result += sum[31 -i] % 5;
        }
        return result;
    }
}

