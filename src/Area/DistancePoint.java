package Area;

/**
 * Created by P.Zagrebelniy on 21.12.2015.
 */
public class DistancePoint {
    public static double DistancePointCoordinates (float ax ,float ay , float bx ,float by ) {
        double sqrt;
        sqrt =  Math.sqrt((bx - ax) *(bx - ax)) +((by - ay) *(by - ay));
        return sqrt;
    }
}
