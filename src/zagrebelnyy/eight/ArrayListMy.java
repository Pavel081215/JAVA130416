package zagrebelnyy.eight;

import zagrebelnyy.eight.oop.file.Audio;
import zagrebelnyy.eight.oop.file.File;
import zagrebelnyy.eight.oop.file.Image;
import zagrebelnyy.eight.oop.file.Text;
import zagrebelnyy.eight.oop.flowers.*;
import zagrebelnyy.eight.oop.music.Guitar;
import zagrebelnyy.eight.oop.music.MusicInstrument;
import zagrebelnyy.eight.oop.music.Piano;
import zagrebelnyy.eight.oop.music.Trumpet;

import java.util.ArrayList;

/**
 * Created by Pavel on 16.01.2016.
 */
public class ArrayListMy {

    public static void main(String[] args) {

        ArrayList<MusicInstrument> arrayMusic = new ArrayList<>();
        arrayMusic.add(new Guitar("First"));
        arrayMusic.add(new Piano("First"));
        arrayMusic.add(new Trumpet("First"));
        arrayMusic.add(new Guitar("Second"));

        ArrayList<Flower> arrayFlowers = new ArrayList<>();
        arrayFlowers.add(new Rose("First",3));
        arrayFlowers.add(new Tulip("First",5));
        arrayFlowers.add(new Chamomile("First", 6));
        arrayFlowers.add(new Aster("Second", 65));

        ArrayList<File> arrayFile = new ArrayList<>();
        arrayFile.add(new Audio("First"));
        arrayFile.add(new Image("First"));
        arrayFile.add(new Text("Second"));


        for ( MusicInstrument element : arrayMusic) {
            System.out.println(element.getName());
        }
        System.out.println("     ");
        for ( Flower element : arrayFlowers) {
            System.out.println(element.getName());
        }
        System.out.println("     ");
        for ( File element : arrayFile) {
            System.out.println(element.getName());
        }

        }

    }



