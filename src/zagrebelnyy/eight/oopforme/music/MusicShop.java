package zagrebelnyy.eight.oopforme.music;


import zagrebelnyy.eight.Printable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class MusicShop implements Printable {
    String name;
    int size;
    private ArrayList<MusicInstrument> musicInstruments;

    public MusicShop(String name, int size, ArrayList<MusicInstrument> musicInstrument) {
        this.name = name;
        this.size = size;
        this.musicInstruments = musicInstrument;
    }


    public void sortMusicInstrument() {
        MusicInsrumentUtils.sortMusicInstrumentUtils(musicInstruments);

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
