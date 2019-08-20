package L7.Hw3;

public class CalifoniaTrack extends Track {

    Instrument drum = new Drum();
    Instrument flute = new Flute();

    public CalifoniaTrack() {
        for (int i=0; i<SONG_LENGHT; ++i) {
            if (i % 5 == 0) {
                timeline.add(drum);
            }else if (i % 4 == 0){
                timeline.add(flute);
            }
            else {
                timeline.add(instrument);
            }
        }
    }
}
