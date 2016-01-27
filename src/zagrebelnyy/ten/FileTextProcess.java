package zagrebelnyy.ten;


import zagrebelnyy.nine.Caesarcode;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by P.Zagrebelniy on 26.01.2016.
 */
public class FileTextProcess {

    public static void printDecodeTextFromInsideFile(String way, int key) throws Exception {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(way)));
            while (s.hasNext()) {
                String text = s.next();
                System.out.println("Текст из файла -  исходник");
                System.out.println(text);
                text = Caesarcode.decode(text,key );
                System.out.println("Текст из файла -  разкодированный");
                System.out.println(text);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Oops, FileNotFoundException caught");

        } finally {
            if (s != null) {
                s.close();
            }
        }
    }

}

