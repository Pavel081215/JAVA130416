package zagrebelnyy.six.file;

import java.lang.reflect.Array;

/**
 * Created by P.Zagrebelniy on 25.12.2015.
 */
public  class Cheks {
    public static   void main(String[] args) {

        File a = new File("Gh");
        File f = new File("3");
        File k = new File("3");

        Directory d = new Directory("4");
        File[] All = {a,f,k};
        Directory.setFiles(All);
        Directory.getFile("3");
    }
}
