package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class MusicShop implements Printable {
    String name;
    int price;
    private List<MusicInstrument>  musicInstrument;

    public MusicShop(String name, int price, List<MusicInstrument> musicInstrument) {
        this.name = name;
        this.price = price;
        this.musicInstrument = musicInstrument;
    }

    @Override
    public void print() {

    }
}
