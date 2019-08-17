package L6.Hw1;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {

        switch (requestedStatus) {
            case BORROWED:
                System.out.println("Перевод книги из статуса " + StatusEnum.BORROWED + " в статус " +
                        requestedStatus + "  невозможен");
                break;
            case ARCHIVED:
            case AVAILABLE:
            case OVERDUED:
                book.status = requestedStatus;
                break;
        }
    }
}

