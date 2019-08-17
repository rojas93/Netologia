package L5.Hw2;

public class Book {
    public Author author;
    public int pages;
    public int year;

    public String toString() {
        return "Book{" +
                "author=" + author.toString() +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}
