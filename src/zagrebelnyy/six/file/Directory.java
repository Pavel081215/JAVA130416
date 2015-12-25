package zagrebelnyy.six.file;

import com.sun.org.apache.xpath.internal.SourceTree;

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

            if (namematches.equals(null)) {
                throw new FileNotFoundException(name);
            }


        } catch (FileNotFoundException e) {

            String m = "Ошибка ввода имени";

            System.out.println(m);
        }
        return namematches;
    }
}








