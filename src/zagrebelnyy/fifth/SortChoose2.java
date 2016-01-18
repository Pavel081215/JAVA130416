package zagrebelnyy.fifth;

import java.io.PrintWriter;
import java.util.Scanner;

public class SortChoose2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minValueIndex];
            a[minValueIndex] = temp;
        }


        for (int i = 0; i < size; i++) {
            printWriter.print(a[i] + " ");
        }
        scanner.close();
        printWriter.close();
    }
}