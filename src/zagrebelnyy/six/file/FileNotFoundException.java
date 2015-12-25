package zagrebelnyy.six.file;

/**
 * Created by P.Zagrebelniy on 25.12.2015.
 */
public class FileNotFoundException extends Exception {
    String name;

    public FileNotFoundException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
