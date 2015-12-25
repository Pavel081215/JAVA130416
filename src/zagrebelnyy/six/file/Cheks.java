package zagrebelnyy.six.file;

import java.lang.reflect.Array;

/**
 * Created by P.Zagrebelniy on 25.12.2015.
 */
public class Cheks {
    public static void main(String[] args) {

        File a = new Audio("Gh");
        File f = new Image("y");
        File k = new Text("i");

        Directory d = new Directory("4");
        File[] All = {a, f, k};
        d.setFiles(All);
        try {
            System.out.println(d.getFile("y"));
        }catch (FileNotFoundException e){
            String m = "Ошибка значения";

            System.out.println(m);
        }

    }
}
