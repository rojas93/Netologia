package L6.Hw2.genre;

public class DetectiveGenre extends GenreByContent{

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }
}
