package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class MusicShop implements Printable {
    String name;
    int price;
    private List<MusicInstrument> musicInstrument;

    public MusicShop(String name, int price, List<MusicInstrument> musicInstrument) {
        this.name = name;
        this.price = price;
        this.musicInstrument = musicInstrument;
    }

    @Override
    public void print() {

        System.out.println("=============================");
        System.out.println("| Name      |  Price        |");
        System.out.println("=============================");
        for (MusicInstrument element : musicInstrument) {
            System.out.print("|" + element.getName() + "\t" + "|" + "\t" + element.getPrice() + "\t" + "\t" + "\t" + "|");
            System.out.println("");
        }
        System.out.println("=============================");
        System.out.println("");
        System.out.println("");

    }
}
