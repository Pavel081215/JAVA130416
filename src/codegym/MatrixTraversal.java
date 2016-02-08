package codegym;

/**
 * Created by Pavel on 08.02.2016.
 * [[1,   2,  3,  4],
 * [5,   6,  7,  8]
 * [9,  10, 11, 12]
 * [13, 14, 15, 16]]
 * вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
 */
public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] matrixB = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        MatrixTraversal matrixTraversal = new MatrixTraversal();

        int[] resolt = new int[16];

        resolt = matrixTraversal.print(matrixB);
        for (int i = 0; i < resolt.length; i++) {
        System.out.println(resolt[i]);
        }
    }

    public int[] print(int[][] input) {

        int h = input.length;
        int w = input[0].length;
        int top = 0;
        int right = w - 1;
        int left = 0;
        int bottom = h - 1;

        int[] array = new int[h * w];
        //   int [] row = input[top];

        int k = 0;
//1
        for (int i = top; i <= right; i++) {
            array[k] = input[top][i];
            k++;
        }
//2
        for (int i = top + 1; i <= bottom; i++) {
            array[k] = input[i][right];
            k++;
        }
//3
        for (int i = bottom-1; i >= left; i--) {
            array[k] = input[bottom][i];
            k++;
        }
//4

        for (int i = bottom - 1; i >= top + 2; i--) {
            array[k] = input[i][top];
            k++;
        }
//5

        for (int i = top; i <= right - 1; i++) {
            array[k] = input[top + 1][i];
            k++;
        }
//6



        for (int i = top + 2; i <= bottom - 1; i++) {
            array[k] = input[i][right - 1];
            k++;
        }
//7
        for (int i = right - 2; i > left; i--) {
            array[k] = input[right - 1][bottom - 2];
            k++;
        }

        return array;
    }

}
