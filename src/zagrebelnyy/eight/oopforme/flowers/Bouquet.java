package zagrebelnyy.eight.oopforme.flowers;

import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Bouquet extends Flower   implements Printable {
    private List<Flower>  flower;
    public Bouquet(String name, int size, List<Flower> flower) {

        super(name, size);
        this.flower = flower;
    }

    @Override
    public void print() {

    }
}
