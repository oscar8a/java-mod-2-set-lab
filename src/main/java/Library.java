import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Library {
    Map<String, Book> bookMap = new HashMap<String, Book>();
    Set<String> genres = new HashSet<>();

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void addBook(Book book) {
        // Map<String, Book> bookMap = getBookMap();
        bookMap.put(book.title, book);
        genres.add(book.genre);
    }

    public Book findBook(Scanner scanner) {
        System.out.println("What is the title of the Book?");
        String bookTitle = scanner.nextLine();

        return bookMap.get(bookTitle);
    }

    public boolean doesGenreExist(String genre) {
        return genres.contains(genre);
    }
}