package zagrebelnyy.nine;

/**
 * Created by P.Zagrebelniy on 22.01.2016.
 */
public class CharArrayEnglish {

    public static void main(String[] args) {


        char[] alphabet = new char[52];
        int k = 97;
        int g = 65;
        for (int i = 0; i < alphabet.length; i++) {
            if (i <= 25) {
                alphabet[i] = (char) k;
                k++;
            } else {
                alphabet[i] = (char) g;
                g++;
            }
        }


        System.out.println(alphabet);
    }

}
