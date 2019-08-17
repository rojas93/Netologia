package L6.Hw1;

public class FromArchievedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {

        switch (requestedStatus){
            case ARCHIVED:
            case BORROWED:
            case OVERDUED:
                System.out.println("Перевод книги из статуса " + StatusEnum.ARCHIVED + " в статус " +
                        requestedStatus + "  невозможен");
                break;
            case AVAILABLE:
                book.status = requestedStatus;
                break;

        }
    }
}
