package Fourth;

/**
 * Created by P.Zagrebelniy on 21.12.2015.
 */
public class DistancePoint {
    public static double distancePointCoordinates(float ax, float ay, float bx, float by) {

        return Math.sqrt((bx - ax) * (bx - ax)) + ((by - ay) * (by - ay));
    }
}
