package L6.Hw2.genre;

public class GenreByNumberOfPages extends Genre{

    public GenreByNumberOfPages() {
        super("Жанр по количеству страниц");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GenreByNumberOfPages GenreByNumberOfPages = (GenreByNumberOfPages) object;

        return attribute != null ? attribute.equals(GenreByNumberOfPages.attribute) : false;
    }
}
