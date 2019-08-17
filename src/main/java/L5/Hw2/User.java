package L5.Hw2;

public class User {
    public String email;
    public String name;
    public String surname;
    public Book[] readBook = new Book[1];

    public String toString() {
        String result = "email = " + email + ", name = " + name + ", surname = " + surname + ", читаемые книги : ";

        for (int i = 0; i < readBook.length; i++) {
            result += this.readBook[i].toString();
        }

        return result;

    }
}
