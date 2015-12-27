package zagrebelnyy.six.music;

/**
 * Created by Pavel on 27.12.2015.
 */
public class Check {
    public static void main(String[] args) {
        MusicShop musicShop = null;

        MusicInstrument guitar;
        MusicInstrument piano;
        MusicInstrument trumpet;
        try {
            guitar = new Piano("Piano");
            piano = new Trumpet("Trumpet");
            trumpet = new Guitar("Guitar");
            MusicInstrument[] all = {guitar, piano, trumpet};
            musicShop = new MusicShop(3, all);
        } catch (NoTrambonomExcption e) {
            System.out.println("Есть трамбон, его не должно быть");
        }

        try {
            musicShop.checkQuantity(4, musicShop.all);
        } catch (MatchesQuantityExcption e) {
            System.out.println("Нет нужного количества");
        }


        //   MusicShop  musicShop = new  MusicShop(3,all);


    }
}
