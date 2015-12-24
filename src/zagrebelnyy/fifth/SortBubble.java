package zagrebelnyy.fifth;

/**
 * Created by P.Zagrebelniy on 24.12.2015.
 */
public class SortBubble {
    public static int[] bubbleSortFirst(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }
}
