package zagrebelnyy.seven;


public class SortInserts {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int y = i - 1;
            while (y >= 0 && arr[y] > x) {
                arr[y + 1] = arr[y];
                arr[y] = x;
                y--;
            }
        }
    }

    public static void insertionSort2(int[] m, int a, int b) {
        int t;
        int i, j;
        for (i = a; i < b; i++) {
            t = m[i];
            for (j = i - 1; j >= a - 1 && m[j] > t; j--)
                m[j + 1] = m[j];

            m[j + 1] = t;
        }
    }
}
