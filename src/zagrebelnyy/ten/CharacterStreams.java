package zagrebelnyy.ten;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html

public class CharacterStreams {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src//zagrebelnyy//ten//xanadu.txt");
            out = new FileWriter("src//zagrebelnyy//ten//characteroutput.txt");

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

