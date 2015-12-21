package Area;

/**
 * Created by P.Zagrebelniy on 21.12.2015.
 */
public class TemperatureDegrees {
    public static float CelsiusFahrenhei (float degrees) {

        degrees =  32.0f + ((9f / 5f) * degrees);
        return degrees;
    }

    public static float FahrenheitCelsius (float degrees) {

        degrees =  ((5f / 9f)*degrees) - 32.0f;
        return degrees;
    }
}
