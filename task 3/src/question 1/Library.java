import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books; // ArrayList to store book objects

    // Constructor to initialize the books array
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Method to remove a book by its ID
    public boolean removeBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                return true;
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    // Method to search for a book by its ID
    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    // Method to display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }

    // Method to demonstrate library actions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Library System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a book
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(bookId, title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Remove a book by ID
                    System.out.print("Enter Book ID to remove: ");
                    int removeBookId = scanner.nextInt();
                    library.removeBook(removeBookId);
                    break;

                case 3:
                    // Search for a book by ID
                    System.out.print("Enter Book ID to search: ");
                    int searchBookId = scanner.nextInt();
                    Book foundBook = library.searchBook(searchBookId);
                    if (foundBook != null) {
                        foundBook.displayBookDetails();
                    }
                    break;

                case 4:
                    // Display all books
                    library.displayBooks();
                    break;

                case 5:
                    // Exit the system
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
