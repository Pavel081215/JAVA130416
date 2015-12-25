package zagrebelnyy.six.file;

public class Directory extends File {

    private String name;
    private File[] files;

    public Directory(String name) {
        super(name);
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public String getFile(String fileName) {
        String namematches = null;
        try {

            for (int i = 0; i < files.length; i++) {
                if (files[i].getName().equals(fileName)) {
                    namematches = files[i].getName();
                }
            }

            if (namematches == null) {
                throw new FileNotFoundException(name);
            }


        } catch (FileNotFoundException e) {

            System.out.println("Ошибка несовпадает Имя");
        }
        return namematches;
    }
}








