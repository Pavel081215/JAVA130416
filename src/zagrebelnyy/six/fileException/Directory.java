package zagrebelnyy.six.fileException;


import java.io.FileNotFoundException;

public class Directory extends File {


    private File[] files;

    public Directory(String name) throws WrongFileNameException {
        super(name);
    }

    public void setFiles(File[] all) {
        files = all;
    }

    public String getFile(String fileName) throws FileNotFoundException {
        String inform = null;

        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().equals(fileName)) {
                inform = files[i].getName();
                break;
            }
        }
        if (inform == null) {
            throw new FileNotFoundException(fileName);
        }
        return inform;
    }
}







