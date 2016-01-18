package zagrebelnyy.eight;

import zagrebelnyy.eight.oopforme.file.Audio;
import zagrebelnyy.eight.oopforme.file.File;
import zagrebelnyy.eight.oopforme.file.Image;
import zagrebelnyy.eight.oopforme.file.Text;
import zagrebelnyy.eight.oopforme.flowers.*;
import zagrebelnyy.eight.oopforme.music.Guitar;
import zagrebelnyy.eight.oopforme.music.MusicInstrument;
import zagrebelnyy.eight.oopforme.music.Piano;
import zagrebelnyy.eight.oopforme.music.Trumpet;

import java.util.ArrayList;

/**
 * Created by Pavel on 16.01.2016.
 */
public class ArrayListMy {

    public static void main(String[] args) {

        ArrayList<MusicInstrument> arrayMusic = new ArrayList<>();
        arrayMusic.add(new Guitar("First ", 4));
        arrayMusic.add(new Piano("First ", 5));
        arrayMusic.add(new Trumpet("First ", 8));
        arrayMusic.add(new Guitar("Second", 9));

        ArrayList<Flower> arrayFlowers = new ArrayList<>();
        arrayFlowers.add(new Rose("First ", 23));
        arrayFlowers.add(new Tulip("First ", 53));
        arrayFlowers.add(new Chamomile("First ", 45));
        arrayFlowers.add(new Aster("Second", 65));

        ArrayList<File> arrayFile = new ArrayList<>();
        arrayFile.add(new Audio("First "));
        arrayFile.add(new Image("First "));
        arrayFile.add(new Text("Second"));

        System.out.println(arrayMusic);
        System.out.println("===========================");
        System.out.println("| Name       | Price      |");
        System.out.println("===========================");
        for (MusicInstrument element : arrayMusic) {
            System.out.print("|" + element.getName() + "      |" + element.getPrice() + "           |  ");
            System.out.println("               ");
        }
        System.out.println("===========================");
        System.out.println("");
        System.out.println("");


        System.out.println(arrayFlowers);
        System.out.println("===========================");
        System.out.println("| Name       | Size       |");
        System.out.println("===========================");
        for (Flower element : arrayFlowers) {
            System.out.println("|" + element.getName() + "       |" + element.getSize() + "         |  ");
        }
        System.out.println("===========================");

        System.out.println("");
        System.out.println("");


        System.out.println(arrayFile);
        System.out.println("=======================");
        System.out.println("| Name                |");
        System.out.println("=======================");
        for (File element : arrayFile) {
            System.out.println("|" + element.getName() + "               |");
        }
        System.out.println("=======================");

    }

}



