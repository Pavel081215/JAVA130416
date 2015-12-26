package zagrebelnyy.six.flowers;

/**
 * Created by Pavel on 26.12.2015.
 */
public class ObjectsNotSameException extends Exception {

    private Flower[] flowers;
    private String info;

    public ObjectsNotSameException(Flower[] flowers) {
        this.flowers = flowers;
        info = "Одинаковых цветов в букете не должно быть";
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public String getInfo() {
        return info;
    }
}
