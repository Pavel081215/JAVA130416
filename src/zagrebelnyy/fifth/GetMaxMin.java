package zagrebelnyy.fifth;

public class GetMaxMin {
    public static int getMax(int[] a) {
        int max = a[0];
        for (int q = 0; q < a.length-1; q++) {
            if (max < a[q+1]) {
                max = a[q+1];
            }
        }
        return max;
    }

    public static int getMin(int[] a) {
        int min = a[0];
        for (int q = 0; q < a.length-1; q++) {
            if (min > a[q+1]) {
                min = a[q+1];
            }
        }
        return min   ;
    }
}