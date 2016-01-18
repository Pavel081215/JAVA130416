package zagrebelnyy.eight.oopforme.flowers;


import java.util.ArrayList;

public abstract class Flower {


    private String name;
    private int size;


    public Flower(String name, int size) {
        this.name = name;

        this.size = size;


    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Flower";
    }


    public static ArrayList sortFlowers(ArrayList<Flower> flower) {
        for (int i = 0; i < flower.size(); i++) {
            for (int j = 0; j < flower.size() - i - 1; j++) {
                if (flower.get(j).getName().compareTo(flower.get(j + 1).getName()) > 0) {
                    Flower temp = flower.get(j);
                    flower.set(j, flower.get(j + 1));
                    flower.set(j + 1, temp);
                }
            }
        }
        return flower;
    }
}



