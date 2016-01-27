package zagrebelnyy.ten;

import zagrebelnyy.nine.Caesarcode;

import java.io.*;

/**
 * Created by Pavel on 24.01.2016.
 */
public class WriteTextInFile {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите  имя файла");
        String nameFile = in.readLine();
        System.out.println("Введите текст в файл");
        String textInFile = in.readLine();
        System.out.println("Введите ключ шифрования и разшифрования");
        int key = Integer.parseInt(in.readLine());
        textInFile = Caesarcode.encode(textInFile, key);
        BufferedWriter out = new BufferedWriter(new FileWriter("src//zagrebelnyy//ten//" + nameFile + ".txt"));
        out.write(textInFile, 0, textInFile.length());
        in.close();
        out.close();
        FileTextProcess.printDecodeTextFromInsideFile("src//zagrebelnyy//ten//" + nameFile + ".txt", key);
    }


}


