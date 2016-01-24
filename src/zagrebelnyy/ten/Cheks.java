package zagrebelnyy.ten;

import java.io.*;

/**
 * Created by Pavel on 24.01.2016.
 */
public class Cheks {

    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new BufferedWriter(new FileWriter("src//zagrebelnyy//ten//outagain.txt"));
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

