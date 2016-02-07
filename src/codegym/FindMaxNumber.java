package codegym;

/**
 * Created by Pavel on 06.02.2016.
 */
public class FindMaxNumber {
    public static void main(String[] args) {

    }

    public int max(int[] input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }


}
