package zagrebelnyy.eight.oopforme.flowers;

import java.util.ArrayList;

/**
 * Created by Pavel on 19.01.2016.
 */
public class FlowerUtils {

    public static ArrayList sortFlowersUtils(ArrayList<Flower> flower) {
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
