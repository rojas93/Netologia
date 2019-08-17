package L6.Hw2.genre;

public class NovelGenre extends GenreByNumberOfPages{


    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }
}
