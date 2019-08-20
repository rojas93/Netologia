package L7.Hw3;

import java.util.ArrayList;
import java.util.List;

public class Track {

    protected int SONG_LENGHT = 10;

    protected List<Instrument> timeline = new ArrayList<>(SONG_LENGHT);
    protected Instrument cello = new Cello();
    protected Instrument instrument = new Instrument();

    public Track() {
        for (int i=0; i<SONG_LENGHT; ++i) {
            if (i % 4 == 0) {
                timeline.add(cello);
            } else {
                timeline.add(instrument);
            }
        }
    }

}
