package zagrebelnyy.six.file;

import java.io.FileNotFoundException;

public abstract class File {
    private String name;

    public File(String name) throws WrongFileNameException {

        if (name != null) {
            this.name = name;
        } else {
            throw new WrongFileNameException(name);
        }
    }

    public String getName() {
        return name;
    }
}
