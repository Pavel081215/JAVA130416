package zagrebelnyy.seven;

/**
 * Created by Pavel on 13.01.2016.
 */
public class PrintCheks {

    public static void printCheks(String name, int[] training) {

        System.out.println(name);
        for (int j = 0; j < training.length; j++) {
            System.out.print("    ");
            System.out.print(training[j]);
        }
        System.out.println("");
    }


}
