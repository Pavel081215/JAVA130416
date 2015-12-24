package zagrebelnyy.fifth;

/**
 * Created by P.Zagrebelniy on 23.12.2015.
 */
public class Sortmaxmin {
    public static int maxSort(int[] a) {
        int max = a[0];
        for (int q = 0; q < a.length; q++) {
            if (max < a[q]) {
                max = a[q];
            }
        }
        return max;
    }

    public static int minSort(int[] a) {
        int min = a[0];
        for (int q = 0; q < a.length; q++) {
            if (min > a[q]) {
                min = a[q];
            }
        }
        return min;
    }
}

