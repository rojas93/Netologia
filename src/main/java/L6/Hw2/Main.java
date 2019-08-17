package L6.Hw2;

import L6.Hw2.genre.*;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Создадим первую книгу с тремя жанрами (Arrays.asList - создает список жанров List<Genre>)
        Book book1 = new Book("Властелин колец", Arrays.asList(new StoryGenre(), new ProseGenre(), new FantasticGenre()));
        //Создадим вторую книгу с двумя жанрами (Arrays.asList - создает список жанров List<Genre>)
        Book book2 = new Book("Шерлок Холмс", Arrays.asList(new NovelGenre(), new DetectiveGenre()));

        //Создадим объект `BookService` - для фильтрации
        BookService bookService = new BookService();

        //Вызовем метод фильтрации, куда передадим список книг и жанр фильтрации в качестве аргументов
        bookService.filterBookByGenre(Arrays.asList(book1, book2), new StoryGenre());
        bookService.filterBookByGenre(Arrays.asList(book1, book2), new DetectiveGenre());
        bookService.filterBookByGenre(Arrays.asList(book1, book2), new NarrativeGenre());
        bookService.filterBookByGenre(Arrays.asList(book1, book2), new VerseGenre());
    }
}
