package zagrebelnyy.eight.oopforme.music;

import java.util.ArrayList;

/**
 * Created by Pavel on 19.01.2016.
 */
public class MusicInsrumentUtils {
    public static ArrayList sortMusicInstrumentUtils(ArrayList<MusicInstrument> musicInstrument) {
        for (int i = 0; i < musicInstrument.size(); i++) {
            for (int j = 0; j < musicInstrument.size() - i - 1; j++) {
                if (musicInstrument.get(j).getPrice() > musicInstrument.get(j + 1).getPrice()) {
                    MusicInstrument temp = musicInstrument.get(j);
                    musicInstrument.set(j, musicInstrument.get(j + 1));
                    musicInstrument.set(j + 1, temp);
                }
            }
        }
        return musicInstrument;
    }

}
