package L5;

public class Hw1 {
    public String title;
    public String author;
    public int year;
    public String publisher;
    public int countPage;
    public double price;

    public Hw1(String title, String author, int year, String publisher, int countPage, double price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.countPage = countPage;
        this.price = price;
    }

    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", countPage=" + countPage +
                ", price=" + price;
    }

    public boolean comparisonCountPage(int countPage){
        if(this.countPage < countPage){
            return false;
        } else{
            return true;
        }
    }
}

