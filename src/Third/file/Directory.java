package Third.file;

public class Directory extends File {
    private File audio;
    private File text;
    private File image;

    public Directory(Audio audio, Text text, Image image) {
        this.audio = audio;
        this.text = text;
        this.image = image;
    }
}
