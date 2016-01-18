package zagrebelnyy.eight.oopforme.flowers;


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
}



