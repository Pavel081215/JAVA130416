package codegym;

/**
 * Created by Pavel on 06.02.2016.
 */
public class JoinCharacters {

    public static void main(String[] args) {

        JoinCharacters joinCharacters = new JoinCharacters();
        char[] join = {'1', '2', '3'};
        System.out.println(joinCharacters.join(join));

    }

    public int join(char[] input) {

        int digit =0 ;
        for (int i = 0; i < input.length; i++){
            digit = digit * 10;
            digit += Character.getNumericValue(input[i]);
        }

        return  digit;
    }


}
