package zagrebelnyy.ten;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html

    public class CharacterStreams {
        public static void main(String[] args) throws IOException {

            FileReader inputStream = null;
            FileWriter outputStream = null;

            try {
                inputStream = new FileReader("src//zagrebelnyy//ten//xanadu.txt");
                outputStream = new FileWriter("src//zagrebelnyy//ten//characteroutput.txt");

                int c;
                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }

