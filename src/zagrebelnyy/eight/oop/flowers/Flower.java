package zagrebelnyy.eight.oop.flowers;


public abstract class Flower {


    private String name;
    private int size;


    public Flower(String name, int size)  {
        this.name = name;
        if (13 < size && size < 50) {
            this.size = size;
        } else {

        }
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}



