package zagrebelnyy.eight;

import zagrebelnyy.eight.oopforme.file.*;
import zagrebelnyy.eight.oopforme.flowers.*;
import zagrebelnyy.eight.oopforme.music.*;


import java.util.ArrayList;

/**
 * Created by Pavel on 16.01.2016.
 */
public class ArrayListForMe {

    public static void main(String[] args) {

        ArrayList<MusicInstrument> arrayMusic = new ArrayList<>();
        arrayMusic.add(new Guitar("First1 ", 4));
        arrayMusic.add(new Piano("First2 ", 2));
        arrayMusic.add(new Trumpet("First3 ", 8));
        arrayMusic.add(new Guitar("Second1", 7));

        ArrayList<Flower> arrayFlowers = new ArrayList<>();
        arrayFlowers.add(new Rose("Rose1    ", 2133));
        arrayFlowers.add(new Rose("Rose2    ", 442));
        arrayFlowers.add(new Rose("Rose4    ", 2323));
        arrayFlowers.add(new Tulip("Tulip2    ", 523));
        arrayFlowers.add(new Tulip("Tulip3    ", 33));
        arrayFlowers.add(new Tulip("Tulip4    ", 555));
        arrayFlowers.add(new Tulip("Tulip5    ", 522));
        arrayFlowers.add(new Chamomile("Chamomile3", 145));
        arrayFlowers.add(new Chamomile("Chamomile4", 425));
        arrayFlowers.add(new Chamomile("Chamomile5", 456));
        arrayFlowers.add(new Chamomile("Chamomile6", 645));
        arrayFlowers.add(new Aster("Aster1    ", 65));
        arrayFlowers.add(new Aster("Aster2    ", 653));
        arrayFlowers.add(new Aster("Aster5    ", 165));


        ArrayList<File> arrayFile = new ArrayList<>();
        arrayFile.add(new Audio("First12 "));
        arrayFile.add(new Image("First2 "));
        arrayFile.add(new Text("Second1"));


        Directory directory = new Directory("First", arrayFile);
        directory.print();
        directory.sortFile();
        // File.sortFile(arrayFile);
        directory.print();


        Bouquet bouquet = new Bouquet("First", 5, arrayFlowers);
        bouquet.print();
        bouquet.sortFlowers();
        //  Flower.sortFlowers(arrayFlowers);
        bouquet.print();

        MusicShop musicShop = new MusicShop("Second", 4, arrayMusic);
        musicShop.print();
        musicShop.sortMusicInstrument();
        //  MusicInstrument.sortMusicInstrument(arrayMusic);
        musicShop.print();




        /*

        MusicInstrument.print(arrayMusic);
        MusicInstrument.sortMusicInstrument(arrayMusic);
        MusicInstrument.print(arrayMusic);

        Flower.print(arrayFlowers);
        Flower.sortFlowers(arrayFlowers);
        Flower.print(arrayFlowers);



        File.print(arrayFile);
        File.sortFile(arrayFile);
        File.print(arrayFile);*/


    }


}



