import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pavel on 06.02.2016.
 */
public class Alphabet {
    public static void main(String[] args) {

        Alphabet alphabet =  new Alphabet();

        alphabet.check("abcdefghijklmnopqrstuvwxyz");
     //   System.out.println(alphabet);

    }

        public boolean check(String input) {

            Set<Character> set  = new HashSet<>();

            for (int i = 0; i < input.length(); i++){
                set.add(input.charAt(i));
            }


            for (int s = 0; s<26; s++){
                if (!set.contains('a' + s) && !set.contains('A' + s)){
                    return false;
                }
            }

            return true;
        }

    }

