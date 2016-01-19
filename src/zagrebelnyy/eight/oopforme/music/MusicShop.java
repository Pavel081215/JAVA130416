package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class MusicShop implements Printable {
    String name;
    int size;
    private List<MusicInstrument> musicInstruments;

    public MusicShop(String name, int price, List<MusicInstrument> musicInstrument) {
        this.name = name;
        this.size = price;
        this.musicInstruments = musicInstrument;
    }

    @Override
    public void print() {

        System.out.println("=============================");
        System.out.println("| Name      |  Price        |");
        System.out.println("=============================");
        for (MusicInstrument element : musicInstruments) {
            System.out.print("|" + element.getName() + "\t" + "|" + "\t" + element.getPrice() + "\t" + "\t" + "\t" + "|");
            System.out.println("");
        }
        System.out.println("=============================");
        System.out.println("");
        System.out.println("");

    }
}
