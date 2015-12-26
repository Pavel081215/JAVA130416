package zagrebelnyy.six.flowers;


public abstract class Flower {


    private String name;
    private int size;


    public Flower(String name, int size) throws NegativSizeException {
        this.name = name;
        if (13 < size && size < 50) {
            this.size = size;
        } else {
            throw new NegativSizeException(size);
        }
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}



