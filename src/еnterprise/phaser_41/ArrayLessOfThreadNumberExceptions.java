package еnterprise.phaser_41;

/**
 * Created by Pavel on 07.04.2016.
 */
public class ArrayLessOfThreadNumberExceptions extends Exception {
    String info;

    public ArrayLessOfThreadNumberExceptions() {
        this.info = "Array is less than thread number ";
    }

    public String getInfo() {
        return info;
    }


}
