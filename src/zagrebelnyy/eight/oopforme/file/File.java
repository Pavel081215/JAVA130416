package zagrebelnyy.eight.oopforme.file;

import zagrebelnyy.eight.ArrayElements;

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
        for (int i = 0; i < file.size(); i++) {
            for (int j = 0; j < file.size() - i - 1; j++) {
                if (file.get(j).getName().length() > file.get(j + 1).getName().length()) {
                    File temp = file.get(j);
                    file.set(j, file.get(j + 1));
                    file.set(j + 1, temp);
                }
            }
        }
        return file;
    }



}
