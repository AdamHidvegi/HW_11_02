import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before() {
        borrower = new Borrower("Jordan");
        book1 = new Book("title1", "author1", "fantasy");
        book2 = new Book("title2", "author2", "crime");
        book3 = new Book("title3", "author3", "fantasy");
        book4 = new Book("title4", "author4", "sci-fi");
    }

    @Test
    public void checkCollection__empty() {
        assertEquals(0, borrower.checkCollection());
    }

    @Test
    public void checkCollection__notEmpty() {
        borrower.borrowBook(book1);
        borrower.borrowBook(book2);
        assertEquals(2, borrower.checkCollection());
    }

}
