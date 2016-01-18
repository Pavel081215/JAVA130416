package zagrebelnyy.seven;


public class SortBubble {

    public static int[] bubbleSortDecrease(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    changeArrayElements(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSortIncrease(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    changeArrayElements(arr, j, j + 1);
                }

            }
        }
        return arr;
    }


    public static int[] changeArrayElements(int[] arr, int index, int next) {
        int temp = arr[index];
        arr[index] = arr[next];
        arr[next] = temp;
        return arr;
    }
}

