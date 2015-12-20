package Fourth;

/**
 * Created by Pavel on 20.12.2015.
 */
public class Distancepoints {
    public static void main(String[] args) {
        int coordinatePXA = 20;
        int coordinatePYB = 30;
        int coordinateKXQ = 53;
        int coordinateKYW = 65;
        int side1 =0;
        int side2 =0;
        double distance = 0;
        side1 = coordinateKXQ - coordinatePXA;
      //  System.out.println(side1);
        side2 = coordinateKYW - coordinatePYB;
     //   System.out.println(side2);
        distance  = (side1*side1)+(side2*side2);
        distance =  Math.sqrt(distance) ;

        System.out.println("Растояние между точками P и K составит = " + distance);


    }
}
