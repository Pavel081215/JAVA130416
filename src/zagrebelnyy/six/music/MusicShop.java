package zagrebelnyy.six.music;

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


    public String checkQuantity(int quantity, MusicInstrument[] all) throws MatchesQuantityExcption {
        String info;
        if (quantity == all.length) {
            info = "Количестов инструментов соврадает";
        } else {
            throw new MatchesQuantityExcption();
        }
        return info;
    }


}
