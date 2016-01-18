package zagrebelnyy.eight.oopforme.file;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */

public class Directory extends File {
    private List<File> files;

    public Directory(String name, List<File> files) {
        super(name);
        this.files = files;
    }
}

