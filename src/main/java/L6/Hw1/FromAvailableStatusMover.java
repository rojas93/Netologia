package L6.Hw1;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {

        switch (requestedStatus) {
            case AVAILABLE:
            case OVERDUED:
                System.out.println("Перевод книги из статуса " + StatusEnum.AVAILABLE + " в статус " +
                        requestedStatus + "  невозможен");
                break;
            case BORROWED:
            case ARCHIVED:
                book.status = requestedStatus;
                break;
        }
    }
}

