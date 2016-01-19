package zagrebelnyy.eight.oopforme.file;


import zagrebelnyy.eight.Printable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */

public class Directory extends File implements Printable {
    private List<File> files;

    public Directory(String name, List<File> files) {
        super(name);
        this.files = files;
    }

    @Override
    public void print() {

        System.out.println("=====================");
        System.out.println("| Name              |");
        System.out.println("=====================");
        for (File element : files) {
            System.out.println("|" + element.getName() + "\t" + "\t" + "\t" + "|");
        }
        System.out.println("=====================");
        System.out.println(" ");

    }


}

