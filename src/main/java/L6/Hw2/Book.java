package L6.Hw2;

import L6.Hw2.genre.Genre;
import L6.Hw2.genre.GenreEnum;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Genre> genres;

    public Book(String title, List<Genre> genres) {
        this.title = title;
        this.genres = genres;
    }

    //for creating new Book
    public Book(String title) {
        this.title = title;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return this.title;
    }

}
