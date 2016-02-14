package codegym;

/**
 * Created by Pavel on 14.02.2016.
 */
public class ReverseBits {

    public static void main(String[] args) throws Exception{

        ReverseBits reverseBits = new ReverseBits();
        System.out.println(reverseBits.reverse(1));


    }


    public int reverse(int input) {

        int result = 0;

        for (int i = 1; i <= 32; i++) {
            int mask = 1;
            int temp = mask & input;
            if (temp == 1) {
                result = result << 1;
                result += 1;
            } else {
                result = result<<1;
            }
            input = input>>1 ;
        }
        return result;
    }

}
