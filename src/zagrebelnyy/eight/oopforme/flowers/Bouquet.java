package zagrebelnyy.eight.oopforme.flowers;

import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Bouquet implements Printable {
    String name;
    int size;
    private List<Flower> flowers;

    public Bouquet(String name, int size, List<Flower> bouquet) {
        this.name = name;
        this.size = size;
        this.flowers = bouquet;
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
