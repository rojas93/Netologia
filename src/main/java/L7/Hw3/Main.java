package L7.Hw3;

public class Main {

    public static void main(String[] args) {
        Song song = new Song();
        for (Track track: song.timeline) {
            for (Instrument instrument: track.timeline) {
                instrument.printNote();
            }
            System.out.println();
        }
    }
}
