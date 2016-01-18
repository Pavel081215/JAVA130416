package zagrebelnyy.eight.oopforme.music;

public abstract class MusicInstrument {

    private String name;
    private int size;

    public MusicInstrument(String name,int price) {

        this.name = name;
        this.size = price;


    }

    public int getPrice() {
        return size;
    }

    public String getName() {
        return name;



    }

    @Override
    public String toString() {
        return "MusicInstrument";
    }
}
