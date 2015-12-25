package zagrebelnyy.six.file;

import java.lang.reflect.Array;

/**
 * Created by P.Zagrebelniy on 25.12.2015.
 */
public class Cheks {
    public static void main(String[] args) {

        File a = new Audio("Gh");
        File f = new Image("3");
        File k = new Text("3");

        Directory d = new Directory("4");
        File[] All = {a, f, k};
        d.setFiles(All);
        System.out.println(d.getFile("Gh"));
    }
}
