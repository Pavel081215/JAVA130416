package Area;

/**
 * Created by P.Zagrebelniy on 21.12.2015.
 */
public class TemperatureDegrees {
    public static float celsiusFahrenhei (float degrees) {
                return 32.0f + ((9f / 5f) * degrees);
    }

    public static float fahrenheitCelsius (float degrees) {
                return ((5f / 9f)*degrees) - 32.0f;
    }
}
