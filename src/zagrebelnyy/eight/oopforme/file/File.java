package zagrebelnyy.eight.oopforme.file;

import zagrebelnyy.eight.ArrayElements;

import java.awt.*;
import java.util.ArrayList;

public abstract class File {


    private String name;

    public File(String name) {
        this.name = name;
    }


    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "File";
    }

    public static ArrayList sortFile(ArrayList<File> file) {
        FileUtils.sortFileUtils(file);
        return file;
    }

   /* public static void print(ArrayList<File> arrayFile) {
        System.out.println(arrayFile);
        System.out.println("=====================");
        System.out.println("| Name              |");
        System.out.println("=====================");
        for (File element : arrayFile) {
            System.out.println("|" + element.getName() + "\t" + "\t" + "\t" + "|");
        }
        System.out.println("=====================");
        System.out.println(" ");
    }*/


}
