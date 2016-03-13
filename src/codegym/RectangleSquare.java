package codegym;

/**
 * Created by Pavel on 10.03.2016.
 */
public class RectangleSquare {
    public static void main(String[] args) {


        RectangleSquare rectangleSquare = new RectangleSquare();
        int[] x = {0, 0};
        int[] h = {20, 10};
        int[] w = {10, 20};


        System.out.println(rectangleSquare.measure(x, h, w));

    }

    public int measure(int[] x, int[] h, int[] w) {

        int resolt = 0;

        int[] temp = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            temp[i] = 0;
        }
        int maxX = RectangleSquare.getMax(w, x);
        int maxY = RectangleSquare.getMax(h, temp);

        int[][] matrics = new int[maxX][maxY];

        for (int j = 0; j < x.length; j++) {

            for (int n = 0; n < w[j]; n++) {
                for (int m = 0; m < h[j]; m++) {
                    matrics[x[j] + n][m] = 1;
                }
            }
        }
        for (int n = 0; n < maxX; n++) {
            for (int m = 0; m < maxY; m++) {
                resolt += matrics[n][m];
            }
        }
        return resolt;
    }

    public static int getMax(int[] a, int[] coordinat) {
        int max = a[0] + coordinat[0];
        for (int q = 0; q < a.length - 1; q++) {
            if (max < a[q + 1] + coordinat[q + 1]) {
                max = a[q + 1] + coordinat[q + 1];
            }
        }
        return max;
    }


}