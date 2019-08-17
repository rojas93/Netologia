package L5.Hw2;


public class Main {
        public static void main(String[] args) throws Exception {
            User user = new User ();
            user.email = "qwerty@ya.com";
            user.name = "Tim";
            user.surname = "Kim";

            Author author = new Author();
            author.name = "Roman";
            author.surname = "Savin";
            author.birthday = "02.06.1972";
            author.country = "Russia";

            Book book = new Book();
            book.author = author;
            book.year = 2017;
            book.pages = 350;

            user.readBook[0] = book;

            System.out.println(user.toString());
        }
}
