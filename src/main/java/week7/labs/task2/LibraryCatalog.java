package week7.labs.task2;

import java.util.List;
import java.util.Optional;

public class LibraryCatalog {
    protected List<Book> books;

    public LibraryCatalog(List<Book> books) {
        this.books = books;
    }

    public Optional<Book> checkAvailability(String title) {
        return books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .filter(book -> book.available());
    }

    public Optional<Book> getFirstAvailableBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equals(author) && book.available())
                .findFirst();
    }
    public void updateAvailability(String title, boolean available) {
        books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .ifPresent(book -> book = new Book(
                        book.title(), book.author(), book.publicationYear(), available
                ));
    }
}
