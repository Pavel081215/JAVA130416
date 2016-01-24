package zagrebelnyy.ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html

public class ByteStreams {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src//zagrebelnyy//ten//xanadu.txt");
            out = new FileOutputStream("src//zagrebelnyy//ten//outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
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