package zagrebelnyy.six.flowers;


public class Check {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet("Red");
        try {
            Flower aster = new Aster("First", 40);
            Flower chamomile = new Chamomile("Second", 49);
            Flower tulip = new Tulip("Third", 40);
            Flower[] all = {aster, chamomile, tulip};
            bouquet.setFlower(all);

        } catch (NegativSizeException e) {
            System.out.println(NegativSizeException.getInfo());
        }

        try {
            System.out.println(Bouquet.sameNotAll(bouquet.getBouqet()));
        } catch (ObjectsNotSameException e) {
            System.out.println("Есть одинаковые цветы");
        }

        try {
            Rosebush rosebush = new Rosebush();
        } catch (NegativSizeException e) {
            System.out.println(NegativSizeException.getInfo());

        }
    }
}
