package zagrebelnyy.eight.oopforme.music;

public class MusicShop {
    private int quantity;


    private MusicInstrument[] allInsrtument;


    public MusicShop(int quantity, MusicInstrument[] allInsrtument) {
        this.quantity = quantity;
        this.allInsrtument = allInsrtument;
    }

    public MusicInstrument[] getAllInsrtument() {

        return allInsrtument;
    }


    public String checkQuantity(int quantity, MusicInstrument[] all)  {
        String info = null;
        if (quantity == all.length) {
            info = "Количестов инструментов соврадает";
        }
        return info;
    }


}
