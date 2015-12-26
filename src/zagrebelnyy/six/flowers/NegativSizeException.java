package zagrebelnyy.six.flowers;

/**
 * Created by Pavel on 26.12.2015.
 */
public class NegativSizeException extends Exception {


    private int size;
    private static String info;

    public NegativSizeException(int info) {

        this.size = info;
        this.info = "Неправельный размер";
    }

    public int getSize() {
        return size;
    }

    public static String getInfo() {
        return info;
    }
}
