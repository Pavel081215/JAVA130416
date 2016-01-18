package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class MusicShop extends MusicInstrument  implements Printable {
    private List<MusicShop> musicShop;
    public MusicShop(String name,int price,List<MusicShop> musicShop) {
        super(name,price );
        this.musicShop = musicShop;
    }

    @Override
    public void print() {

    }
}
