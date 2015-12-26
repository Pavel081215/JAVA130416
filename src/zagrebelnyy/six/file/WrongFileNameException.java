package zagrebelnyy.six.file;

/**
 * Created by Pavel on 25.12.2015.
 */
public class WrongFileNameException extends Exception {

    String info = "Error";

    public WrongFileNameException(String name) {

        this.info = name;
    }

    public String getInfo() {
        return info;
    }
}
