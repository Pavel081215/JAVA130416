package Fourth;

/**
 * Created by Pavel on 20.12.2015.
 */
public class Degrees {

    public static void main(String[] args) {

        float celsius = 0.1f;
        float fahrenheit = 35.5f;
        float a = 9f / 5f;
    //    System.out.println(a);

        a =  32.0f + (a * celsius);

        System.out.println( celsius + " градусов по цельсию  = " + a + " градусов по фаренгейту" );

        a =  fahrenheit  - 32.0f;
     //   System.out.println(b);

        a =  (5f / 9f)*a;

        System.out.println( fahrenheit + " градусов по фаренгейту  = " + a + " градусов по цельсию" );
    }
}
