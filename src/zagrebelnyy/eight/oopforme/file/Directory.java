package zagrebelnyy.eight.oopforme.file;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */

public class Directory extends File  implements Printable {
    private List<File> files;

    public Directory(String name, List<File> files) {
        super(name);
        this.files = files;
    }

    @Override
    public void print() {

    }

    public interface Printable {
        void print();
    }
}

