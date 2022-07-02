import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    Map<String, Book> bookMap = new HashMap<String, Book>();

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void addBook(Book book) {
        // Map<String, Book> bookMap = getBookMap();
        bookMap.put(book.title, book);
    }

    public Book findBook(Scanner scanner) {
        System.out.println("What is the title of the Book?");
        String bookTitle = scanner.nextLine();

        return bookMap.get(bookTitle);
    }
}