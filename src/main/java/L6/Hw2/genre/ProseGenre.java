package L6.Hw2.genre;

public class ProseGenre extends GenreByForm{


    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.name();
    }
}
