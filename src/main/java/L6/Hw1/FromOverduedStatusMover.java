package L6.Hw1;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {

        switch (requestedStatus) {
            case BORROWED:
            case OVERDUED:
                System.out.println("Перевод книги из статуса " + StatusEnum.OVERDUED + " в статус " +
                        requestedStatus + "  невозможен");
                break;
            case ARCHIVED:
            case AVAILABLE:
                book.status = requestedStatus;
                break;
        }
    }
}

