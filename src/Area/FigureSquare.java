package Area;

/**
 * Created by P.Zagrebelniy on 21.12.2015.
 */
public class FigureSquare {
    public static float triangleSquare (float side, float height) {
        height = (height * side)/2;
        return height;
    }

    public static float rectangleSquare (float a, float b) {
        a = a * b ;
        return a;
    }

    public static float circleSquare (float radius) {
        float pi  = 3.14f ;
        pi = (radius*radius) * pi;
        return pi;
    }
}

