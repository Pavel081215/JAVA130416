package zagrebelnyy.eight.oop.music;

public abstract class MusicInstrument {

    private String name;

    public MusicInstrument(String name)  {
        if (name.equals("Trombone")) {

        } else {
            this.name = name;

        }
    }

    public String getName() {
        return name;

    }


}
