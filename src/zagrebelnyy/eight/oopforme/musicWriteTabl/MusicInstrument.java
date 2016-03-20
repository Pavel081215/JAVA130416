package zagrebelnyy.eight.oopforme.musicWriteTabl;


import java.util.ArrayList;


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

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MusicInstrument";
    }


    public static ArrayList sortMusicInstrument(ArrayList<MusicInstrument> musicInstrument) {
        MusicInsrumentUtils.sortMusicInstrumentUtils(musicInstrument);
        return musicInstrument;
    }

   /* public static void print(ArrayList<MusicInstrument> arrayMusic) {
        System.out.println(arrayMusic);
        System.out.println("=============================");
        System.out.println("| Name      |  Price        |");
        System.out.println("=============================");
        for (MusicInstrument element : arrayMusic) {
            System.out.print("|" + element.getName() + "\t" + "|" + "\t" + element.getPrice() + "\t" + "\t" + "\t" + "|");
            System.out.println("");
        }
        System.out.println("=============================");
        System.out.println("");
        System.out.println("");
    }*/


}
