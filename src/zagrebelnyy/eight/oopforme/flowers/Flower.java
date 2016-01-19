package zagrebelnyy.eight.oopforme.flowers;


import java.util.ArrayList;
import java.util.List;

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
        FlowerUtils.sortFlowersUtils(flower);

        return flower;
    }

  /*  public static void print(List<Flower> arrayFlowers) {
        System.out.println(arrayFlowers);
        System.out.println("=============================");
        System.out.println("| Name      |  Size         |");
        System.out.println("=============================");
        for (Flower element : arrayFlowers) {
            System.out.println("|" + element.getName() + "\f" + "\t" + "\t" + "|" + "\t" + element.getSize() + "\t" + "\t" + "\t");
        }
        System.out.println("=============================");

        System.out.println("");
        System.out.println("");
    }*/
}



