package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Orchestra extends MusicInstrument  implements Printable {
    private List<Orchestra> musicShop;
    public Orchestra(String name, int price, List<Orchestra> musicShop) {
        super(name,price );
        this.musicShop = musicShop;
    }

    @Override
    public void print() {

    }
}
