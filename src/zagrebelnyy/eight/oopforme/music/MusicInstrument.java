package zagrebelnyy.eight.oopforme.music;


import java.util.ArrayList;


public abstract class MusicInstrument {

    private String name;
    private int price;

    public MusicInstrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MusicInstrument";
    }


    public static ArrayList sortMusicInstrument(ArrayList<MusicInstrument> musicInstrument) {
        for (int i = 0; i < musicInstrument.size(); i++) {
            for (int j = 0; j < musicInstrument.size() - i - 1; j++) {
                if (musicInstrument.get(j).getPrice() > musicInstrument.get(j + 1).getPrice()) {
                    MusicInstrument temp = musicInstrument.get(j);
                    musicInstrument.set(j, musicInstrument.get(j + 1));
                    musicInstrument.set(j + 1, temp);
                }

            }
        }
        return musicInstrument;
    }


}
