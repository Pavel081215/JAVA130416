package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class MusicShop extends MusicInstrument  implements Printable {
    private List<MusicShop>  musicInstrument;
    public MusicShop(String name, int price, List<MusicShop> musicInstrument) {
        super(name,price );
        this.musicInstrument = musicInstrument;
    }

    @Override
    public void print() {

    }
}
