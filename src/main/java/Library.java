import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> book;
    private int capacity;
    private HashMap<String, Integer> tracker;

    public Library(int capacity) {
        this.book = new ArrayList<Book>();
        this.capacity = capacity;
        this.tracker = new HashMap<String, Integer>();
    }

    public int numberOfBooks() {
        return this.book.size();
    }

    public int checkTracker() {
        return this.tracker.size();
    }

    public boolean checkCapacity() {
        if (this.capacity >= (this.book.size() + 1)) {
            return true;
        }
        return false;
    }

    public void addBook(Book newBook) {
        if (checkCapacity() == true && !this.book.contains(newBook)) {
            this.book.add(newBook);
        }
    }

    public void borrowerGetBook(Book newBook, Borrower borrower) {
        if (this.book.contains(newBook)) {
            this.book.remove(newBook);
            borrower.borrowBook(newBook);
        }
    }

}
