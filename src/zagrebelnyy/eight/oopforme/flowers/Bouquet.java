package zagrebelnyy.eight.oopforme.flowers;

import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Bouquet implements Printable {
    String name;
    int size;
    private List<Flower> bouquet;

    public Bouquet(String name, int size, List<Flower> bouquet) {
        this.name = name;
        this.size = size;
        this.bouquet = bouquet;
    }

    @Override
    public void print() {

        System.out.println("=============================");
        System.out.println("| Name      |  Size         |");
        System.out.println("=============================");
        for (Flower element : bouquet) {
            System.out.println("|" + element.getName() + "\f" + "\t" + "\t" + "|" + "\t" + element.getSize() + "\t" + "\t" + "\t");
        }
        System.out.println("=============================");

        System.out.println("");
        System.out.println("");

    }
}
