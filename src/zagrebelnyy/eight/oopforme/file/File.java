package zagrebelnyy.eight.oopforme.file;

public abstract class File {


    private String name;

    public File(String name)  {

        if (name == null || name.isEmpty()) {

        } else {
            this.name = name;

        }
    }


    public String getName() {

        return name;
    }
}
