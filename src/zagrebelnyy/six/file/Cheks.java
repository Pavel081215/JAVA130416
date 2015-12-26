package zagrebelnyy.six.file;

import java.io.FileNotFoundException;

public class Cheks {
    public static void main(String[] args) throws WrongFileNameException {

        File first = new Audio("First");
        File second = new Image("Second");
        File third = new Text("Third");

        Directory d = new Directory("Fifth");


        File[] All = {first, second, third};
        d.setFiles(All);
        try {
            System.out.println(d.getFile("First"));
        } catch (FileNotFoundException e) {
            String m = "Ошибка значения";

            System.out.println(m);

        }

    }
}
