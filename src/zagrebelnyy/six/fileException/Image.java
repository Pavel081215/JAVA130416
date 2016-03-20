package zagrebelnyy.six.fileException;

public class Image extends File {

    public Image(String name) throws WrongFileNameException {
        super(name);
    }
}
