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
    private List<MusicInstrument> musicInstruments;

    public MusicShop(String name, int size, List<MusicInstrument> musicInstrument) {
        this.name = name;
        this.size = size;
        this.musicInstruments = musicInstrument;
    }


    public void sortMusicInstrument() {
        for (int i = 0; i < musicInstruments.size(); i++) {
            for (int j = 0; j < musicInstruments.size() - i - 1; j++) {
                if (musicInstruments.get(j).getPrice() > musicInstruments.get(j + 1).getPrice()) {
                    MusicInstrument temp = musicInstruments.get(j);
                    musicInstruments.set(j, musicInstruments.get(j + 1));
                    musicInstruments.set(j + 1, temp);
                }
            }
        }

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
