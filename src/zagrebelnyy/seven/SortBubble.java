package zagrebelnyy.seven;


public class SortBubble {
    public static int[] bubbleSortDecrease(int[] arr) {
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
    public static int[] bubbleSortDecreaseUniversal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    substitutionNewValues(arr,j);
                }
            }
        }
        return arr;
    }







    public static int[] bubbleSortIncrease(int[] arr) {
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


    public static int[] bubbleSortIncreaseUniversal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    substitutionNewValues(arr,j);
                }

            }
        }
        return arr;
    }








    public static int[] substitutionNewValues(int[] arr, int index) {
        int temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
        return arr;
            }
}

