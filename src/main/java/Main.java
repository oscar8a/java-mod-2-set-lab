import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        boolean loop = true;
        System.out.println("Welcome to the Library!");
        Scanner scanner = new Scanner(System.in);
        
        loadBooks(library);

        do {
            System.out.println("Would you like to Add or Find a book? 1.Add  2.Find 3.check Genres");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Book newBook = createBook(scanner);
                    library.addBook(newBook);
                    break;
                case 2:
                    Book book = library.findBook(scanner);
                    System.out.println("\nTitle: " + book.title + "\nGenre: " + book.genre + "\nPages: " + book.numberOfPages);
                    break;
                case 3:
                    System.out.println("Please write the genre you want us to check");
                    String genreToCheck = scanner.nextLine();
                    if (library.doesGenreExist(genreToCheck)) {
                        System.out.println("We Have Books of this Genre!");
                    } else {
                        System.out.println("We don't have books of this Genre");
                    }
                default:
                    System.out.println("Please enter 1 or 2");
                    break;
            }



            System.out.println("\nContinue...?? 1-yes 2-no");
            int yn = scanner.nextInt();
            if (yn == 2) {
                loop = false;
            }
            scanner.nextLine();
        } while (loop);

        // library.getBooks();
        // for (Book book : library.getBooks()) {
            // System.out.println(
                    // "\nTitle: " + book.title + "\nGenre: " + book.genre + "\nPages: " + book.numberOfPages);
        // }

        scanner.close();
    }

    static Book createBook(Scanner scanner) {
        String title, genre;
        int pages;
        System.out.println("Add Book information");
        System.out.println("what's the title?");
        title = scanner.nextLine();
        System.out.println("what's the Genre?");
        genre = scanner.nextLine();
        System.out.println("How many pages?");
        pages = scanner.nextInt();
        // scanner.nextLine();
        return new Book(title, genre, pages);
    }

    static void loadBooks(Library library) {
        library.addBook(new Book("a", "This is a bad book", 212));
        library.addBook(new Book("b", "Boring Book", 4892));
        library.addBook(new Book("c", "Awesome Book", 10));
    }
}