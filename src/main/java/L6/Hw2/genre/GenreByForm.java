package L6.Hw2.genre;

public class GenreByForm extends Genre{

    public GenreByForm() {
        super("Жанр по форме книги");

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GenreByForm GenreByForm = (GenreByForm) object;

        return attribute != null ? attribute.equals(GenreByForm.attribute) : false;
    }

}
