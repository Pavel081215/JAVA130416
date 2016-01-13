package zagrebelnyy.six.flowers;

public class Bouquet {

    private String color;
    private Flower[] bouqet;

    public Bouquet(String color) {

        this.color = color;
    }

    public Flower[] getBouqet() {
        return bouqet;
    }

    public void setFlower(Flower[] all) {

        bouqet = all;
    }

    public static String sameNotAll(Flower[] all) throws ObjectsNotSameException {
        for (int i = 0; i < all.length; i++) {
            for (int k = 1 + i; k < all.length; k++) {
                if (all[i].getName().equals(all[k].getName())) {
                    throw new ObjectsNotSameException(all);
                }
            }
        }
        return "Цветы не совпадают";

    }


}

