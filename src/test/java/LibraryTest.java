import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Borrower borrower;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Book("title1", "author1", "fantasy");
        book2 = new Book("title2", "author2", "crime");
        book3 = new Book("title3", "author3", "fantasy");
        book4 = new Book("title4", "author4", "sci-fi");
        borrower = new Borrower("Jordan");
    }

    @Test
    public void numberOfBooks() {
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void checkHashMap() {
        assertEquals(0, library.checkTracker());
    }

    @Test
    public void checkCapacity() {
        assertEquals(true, library.checkCapacity());
    }

    @Test
    public void addBook() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.numberOfBooks());
    }

    @Test
    public void borrowerGetBook() {
        library.addBook(book1);
        library.addBook(book3);
        library.addBook(book4);
        library.borrowerGetBook(book1, borrower);
        library.borrowerGetBook(book2, borrower);
        assertEquals(1, borrower.checkCollection());
        assertEquals(2, library.numberOfBooks());
    }

}
