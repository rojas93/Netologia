package L8.Hw1;

public class Main {

    public static void main(String[] args) {

        Administrator administrator = new AdministratorImpl();
        Reader reader = new ReaderImpl();
        reader.takeBook(administrator);
        reader.returnBook(administrator);

    }
}
