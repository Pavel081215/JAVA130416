package zagrebelnyy.six.music;

public abstract class MusicInstrument {

    private String name;

    public MusicInstrument(String name) throws NoTrambonomExcption {
        if (name.equals("Trombone")) {
            throw new NoTrambonomExcption();
        } else {
            this.name = name;

        }
    }

    public String getName() {
        return name;

    }


}
