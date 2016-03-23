package еnterprise.synchronize.example;

/**
 * Created by Pavel on 23.03.2016.
 */
public class Cart {

    private static int weight = 0;

    public static void addWeight(){
        weight--;
    }

    public static void reduceWeight(){
        weight++;
    }

    public static int getWaight(){
        return weight;
    }
}
