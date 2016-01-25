package zagrebelnyy.ten;

import zagrebelnyy.nine.Caesarcode;

import java.io.*;

/**
 * Created by Pavel on 24.01.2016.
 */
public class WriteTextInFile {

    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите имя файла");
            String name = in.readLine();
            System.out.println("Введите текст в файл");
            String text = in.readLine();
            text = Caesarcode.encode(text, 5);
            out = new BufferedWriter(new FileWriter("src//zagrebelnyy//ten//" + name + ".txt"));
            out.write(text, 0, text.length());
        } catch (IOException e) {
            System.out.println("ошибка ввода вывода");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
