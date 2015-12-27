package zagrebelnyy.six.music;

public abstract class MusicInstrument {

    String name;

    public MusicInstrument(String name) throws NoTrambonomExcption {
        if (name != "Trombone") {
            this.name = name;
        } else {
            throw new NoTrambonomExcption();
        }
    }

    public String getName() {
        return name;
    }
}
