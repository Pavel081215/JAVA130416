package еnterprise.generics;

/**
 * Created by Pavel on 20.03.2016.
 */
public class MethodHasBeenStartedException extends Exception{
    public MethodHasBeenStartedException(String info) {
        this.info = info;
    }

    String info;

    public String getInfo() {
        return info;
    }
}
