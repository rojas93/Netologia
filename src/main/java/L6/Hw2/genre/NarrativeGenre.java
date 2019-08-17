package L6.Hw2.genre;

public class NarrativeGenre extends GenreByNumberOfPages{


    @Override
    public String getGenreName() {
        return GenreEnum.NARRATIVE.name();
    }
}
