package codegym;

/**
 * Created by Pavel on 07.02.2016.
 */
public class CountBits {

        public int count(int num) {
            int counter = 0;
            for(int i = 1; i <=32; i ++){
                int mask = 1<<(i-1);
                int temp = mask & num;
                if (temp != 0 ){
                    counter ++;
                }
            }
            return counter;
        }


}
