package zagrebelnyy.six.file;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileNotFoundException;

public class Directory extends File {

    private String name;
    private File[] files;

    public Directory(String name) {
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
            throw new FileNotFoundException(name);
        }
        return inform;
    }
}







