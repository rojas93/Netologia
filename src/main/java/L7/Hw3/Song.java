package L7.Hw3;

import java.util.ArrayList;
import java.util.List;

public class Song {

    int SONG_LENGHT = 10;

    List<Track> timeline = new ArrayList<>(SONG_LENGHT);
    Track californiaTrack = new CalifoniaTrack();
    Track track = new Track();

    public Song() {
        for (int i=0; i<SONG_LENGHT; ++i) {
            if (i % 4 == 0) {
                timeline.add(californiaTrack);
            } else {
                timeline.add(track);
            }
        }
    }
}
