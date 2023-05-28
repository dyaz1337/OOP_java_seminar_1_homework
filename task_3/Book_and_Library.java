import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }
}

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : catalog) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.println("Books by " + author + ":");
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }
}

public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayAvailableBooks();

        book2.setAvailable(false);

        library.displayAvailableBooks();

        library.searchByAuthor("George Orwell");
    }