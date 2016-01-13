package zagrebelnyy.seven;


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
    public static int[] bubbleSortFirstUniversal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    substitutionNewValues(arr[j], arr[j + 1]);
                }
            }
        }
        return arr;
    }



    public static int[] bubbleSortSecond(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }


    public static int[] bubbleSortSecondUniversal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    substitutionNewValues(arr[j], arr[j + 1]);
                }

            }
        }
        return arr;
    }


    public static void substitutionNewValues(int valueFirst, int valueSecond) {
        int temp = valueFirst;
        valueFirst = valueSecond;
        valueSecond = temp;

    }
}

