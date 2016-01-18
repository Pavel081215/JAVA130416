package zagrebelnyy.eight.oopforme.flowers;

import java.util.List;

/**
 * Created by Pavel on 18.01.2016.
 */
public class Bouquet extends Flower {
    private List<Flower> flower;

    public Bouquet(String color, int size, List<Flower> flower) {
        super(color, size);
        this.flower = flower;
    }
}
