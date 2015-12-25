package zagrebelnyy.six.file;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;

/**
 * Created by P.Zagrebelniy on 25.12.2015.
 */
public class Cheks {
    public static void main(String[] args) {

        File first = new Audio("first");
        File second = new Image("Second");
        File third = new Text("Third");

        Directory d = new Directory("Fifth");
        File[] All = {first, second, third};
        d.setFiles(All);
        try {
            System.out.println(d.getFile("Third"));
        }catch (FileNotFoundException e){
            String m = "Ошибка значения";

            System.out.println(m);
        }

    }
}
