package zagrebelnyy.eight.oopforme.file;


import zagrebelnyy.eight.Printable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */

public class Directory extends File implements Printable {
    private ArrayList<File> files;

    public Directory(String name, ArrayList<File> files) {
        super(name);
        this.files = files;
    }

    public void sortFile() {
        FileUtils.sortFileUtils(files);
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

