package codegym;

/**
 * Created by Pavel on 07.02.2016.
 */
public class AverageNumber {

        public int average(int a, int b) {
            if (Integer.MIN_VALUE == a && Integer.MIN_VALUE==b){
                return Integer.MIN_VALUE;
            }

            if (a < 0 && b >0){

                return (a+b)/2;

            }
            return (a+b)>>>1;

        }


    }

