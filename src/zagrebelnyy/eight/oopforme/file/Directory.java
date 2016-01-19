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

    public void sortFile() {
        for (int i = 0; i < files.size(); i++) {
            for (int j = 0; j < files.size() - i - 1; j++) {
                if (files.get(j).getName().length() > files.get(j + 1).getName().length()) {
                    File temp = files.get(j);
                    files.set(j, files.get(j + 1));
                    files.set(j + 1, temp);
                }
            }
        }

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

