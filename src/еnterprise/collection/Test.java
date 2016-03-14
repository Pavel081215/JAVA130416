package еnterprise.collection;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

// тестовый файл не относиться к домашнему заданию
public class Test {
    public static void main(String[] args) throws IOException {
        double x[][] = {{1.05, 1.21, 2.21},
                {3.21, 2.11, 3.21},
                {4.89, 6.54, 9.51}};
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\src\\еnterprise\\collection\\Test.txt"); //D:\JAVA\src\еnterprise\collection D:\\test.txt
        write2DArray(x, fos);

    }

    public static void write2DArray(double x[][], FileOutputStream fos) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF8"));
        bw.write(String.valueOf(x.length));
        bw.write("\r\n");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                bw.write(String.valueOf(x[i][j]) + " ");
            }
            bw.write("\r\n");
        }
        bw.flush();
    }
}
