package L6.Hw2.genre;

public class StoryGenre extends GenreByNumberOfPages{


    @Override
    public String getGenreName() {
        return GenreEnum.STORY.name();
    }
}
