package zagrebelnyy.six.music;

public class MusicShop {
    int quantity;
    MusicInstrument[] all;

    public MusicShop(int quantity, MusicInstrument[] all) {
        this.quantity = quantity;
        this.all = all;
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
