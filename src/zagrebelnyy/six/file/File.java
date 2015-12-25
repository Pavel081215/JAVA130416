package zagrebelnyy.six.file;

public abstract class File {
    private String name;

    public File(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
