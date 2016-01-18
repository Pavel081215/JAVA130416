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


        MusicInstrument.print(arrayMusic);
        MusicInstrument.sortMusicInstrument(arrayMusic);
        MusicInstrument.print(arrayMusic);

        Flower.print(arrayFlowers);
        Flower.sortFlowers(arrayFlowers);
        Flower.print(arrayFlowers);



        File.print(arrayFile);
        File.sortFile(arrayFile);
        File.print(arrayFile);


    }


}



