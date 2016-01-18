package zagrebelnyy.eight.oopforme.flowers;

import zagrebelnyy.eight.Printable;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Rosebush extends Flower   implements Printable {
    private List<Flower>  flower;
    public Rosebush(String name, int size,List<Flower>  flower ) {

        super(name, size);
        this.flower = flower;
    }

    @Override
    public void print() {

    }
}
