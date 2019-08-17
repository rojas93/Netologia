package L6.Hw1;

public class Book {
    String title;
    StatusEnum status = StatusEnum.AVAILABLE;

    Book(String title){
        this.title = title;
    }

    public StatusEnum getStatus(){
        return status;
    }
}
