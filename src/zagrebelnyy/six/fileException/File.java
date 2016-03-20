package zagrebelnyy.six.fileException;

public abstract class File {


    private String name;

    public File(String name) throws WrongFileNameException {

        if (name == null || name.isEmpty()) {
            throw new WrongFileNameException(name);
        } else {
            this.name = name;

        }
    }


    public String getName() {

        return name;
    }
}
