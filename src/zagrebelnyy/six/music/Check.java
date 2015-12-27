package zagrebelnyy.six.music;

public class Check {
    public static void main(String[] args) {


        MusicInstrument guitar = null;
        MusicInstrument piano = null;
        MusicInstrument trumpet = null;


        try {
            guitar = new Piano("Piano");
            piano = new Trumpet("Trumpet");
            trumpet = new Guitar("Guitar");

        } catch (NoTrambonomExcption e) {
            System.out.println("Есть трамбон, его не должно быть");
        }


        MusicInstrument[] all = {guitar, piano, trumpet};
        MusicShop musicShop = new MusicShop(2, all);


        try {
            musicShop.checkQuantity(3, musicShop.getAllInsrtument());
            System.out.println("Всё нормально");
        } catch (MatchesQuantityExcption e) {
            System.out.println("Нет нужного количества");
        }


    }
}
