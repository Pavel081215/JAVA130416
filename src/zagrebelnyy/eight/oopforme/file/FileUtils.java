package zagrebelnyy.eight.oopforme.file;

import java.util.ArrayList;

/**
 * Created by Pavel on 19.01.2016.
 */
public class FileUtils {


    public static ArrayList sortFileUtils(ArrayList<File> file) {
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
