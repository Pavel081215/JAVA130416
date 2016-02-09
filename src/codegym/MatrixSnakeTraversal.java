package codegym;

/**
 * Created by Pavel on 09.02.2016.
 */
public class MatrixSnakeTraversal {
    public static void main(String[] args) {
        int[][] matrixB = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                           {13, 14, 15, 16}};

        MatrixSnakeTraversal matrixTraversal = new MatrixSnakeTraversal();

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
        //       int [] row = input[top];

        int k = 0;
//1
        while (k <= (h * w) - 1) {
            for (int i = top; i <= bottom; i++) {
                array[k] = input[i][left];
                k++;
            }
            if (k <= (h * w) - 1) {
                for (int i = bottom; i >= top; i--) {
                    array[k] = input[i][left + 1];
                    k++;
                }
            }
            left += 2;

        }
        return array;
    }
}