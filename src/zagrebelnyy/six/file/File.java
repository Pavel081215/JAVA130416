package zagrebelnyy.six.file;

import java.io.FileNotFoundException;

public abstract class File {
    private String name;

    public File(String name) throws FileNotFoundException {

        if (name != null) {
            this.name = name;
        } else {
            throw new FileNotFoundException(name);
        }
    }

    public String getName() {
        return name;
    }
}
