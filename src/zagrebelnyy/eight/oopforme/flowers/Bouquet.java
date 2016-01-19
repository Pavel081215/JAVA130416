package zagrebelnyy.eight.oopforme.flowers;

import zagrebelnyy.eight.Printable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Bouquet implements Printable {
    String name;
    int size;
    private ArrayList<Flower> flowers;

    public Bouquet(String name, int size, ArrayList<Flower> bouquet) {
        this.name = name;
        this.size = size;
        this.flowers = bouquet;
    }

    public void sortFlowers() {
        FlowerUtils.sortFlowersUtils(flowers);

    }

    @Override
    public void print() {

        System.out.println("=============================");
        System.out.println("| Name      |  Size         |");
        System.out.println("=============================");
        for (Flower element : flowers) {
            System.out.println("|" + element.getName() + "\t" + "\t" + "\t" + "|" + "\t" + element.getSize() + "\t" + "\t" + "\t");
        }
        System.out.println("=============================");

        System.out.println("");
        System.out.println("");

    }
}
