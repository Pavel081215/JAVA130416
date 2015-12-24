package Fourth;

/**
 * Created by P.Zagrebelniy on 21.12.2015.
 */
public class FigureSquare {
    public static float triangleSquare(float side, float height) {
        return (height * side) / 2;
    }

    public static float rectangleSquare(float a, float b) {
        return a * b;
    }

    public static float circleSquare(float radius) {
        float pi = 3.14f;
        return (radius * radius) * pi;
    }
}

