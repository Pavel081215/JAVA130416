package codegym;

/**
 * Created by Pavel on 06.02.2016.
 */
public class SumDigits {
    public static void main(String[] args) {


        System.out.println(SumDigits.sum(-256));
    }

    public static int sum(int number) {

        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number =  number /10;
        }
        return Math.abs(sum);
    }

}
