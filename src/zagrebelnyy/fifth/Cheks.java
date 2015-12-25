package zagrebelnyy.fifth;

/**
 * Created by P.Zagrebelniy on 23.12.2015.
 */
public class Cheks {
    public static void main(String[] args) {
        int[] w = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};
        System.out.println(GetMaxMin.getMax(w));
        System.out.println(GetMaxMin.getMin(w));
        SortBubble.bubbleSortFirst(w);
        for (int i = 0; i < w.length; i++) {
            System.out.print("    ");
            System.out.print(w[i]);
        }

        SortBubble.bubbleSortSecond(w);
        System.out.println("    ");
        for (int j = 0; j < w.length; j++) {
            System.out.print("    ");
            System.out.print(w[j]);

        }


    }
}
