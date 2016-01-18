package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Orchestra extends MusicInstrument  implements Printable {
    private List<Orchestra> orchestra;
    public Orchestra(String name, int price, List<Orchestra> orchestra) {
        super(name,price );
        this.orchestra = orchestra;
    }

    @Override
    public void print() {

    }
}
