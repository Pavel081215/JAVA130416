package zagrebelnyy.eight.oopforme.music;

//import zagrebelnyy.seven.SortBubble;

import java.util.ArrayList;
import java.util.List;

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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MusicInstrument";
    }


    public ArrayList sort(ArrayList musicInstrument) {
        for (int i = 0; i < musicInstrument.size(); i++) {
            for (int j = 0; j < musicInstrument.size() - i - 1; j++) {
               // int priceIndex1 = musicInstrument.get(j).getPrice();

                if (musicInstrument.get(j).getPrice() > musicInstrument.get(j -1).getPrice()) {



                    //changeArrayElements(musicInstrument, j, j + 1);
                }

            }
        }
        return musicInstrument;
    }




}
