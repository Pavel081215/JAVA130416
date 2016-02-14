package codegym;

/**
 * Created by Pavel on 14.02.2016.
 */
public class BitsPalindrome {
    public static void main(String[] args) {
        BitsPalindrome bitsPalindrome = new BitsPalindrome();

        System.out.println(bitsPalindrome.isPalindrome(32768));


    }


    public boolean isPalindrome(int input) {

        for (int i = 1; i <= 16; i++) {
            int mask = 1;
            int tempLeft = input >> (32 - i) & mask;
            int trmpRight = input >> (i - 1) & mask;
            if (tempLeft != trmpRight) {
                return false;
            }
        }

        return true;
    }
}
