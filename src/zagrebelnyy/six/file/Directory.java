package zagrebelnyy.six.file;

import com.sun.org.apache.xpath.internal.SourceTree;

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
        String namematches = null;

        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().equals(fileName)) {
                namematches = files[i].getName();
            }
        }
        if (namematches == null) {
            throw new FileNotFoundException(name);
        }
        return namematches;
    }
}







