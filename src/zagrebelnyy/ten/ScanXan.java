package zagrebelnyy.ten;

import java.io.*;
import java.util.Scanner;

//https://docs.oracle.com/javase/tutorial/essential/io/scanning.html

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("src//zagrebelnyy//ten//outagain.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

