package L6.Hw1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, StatusEnum.AVAILABLE);
        System.out.println(book.getStatus());

    }

}
