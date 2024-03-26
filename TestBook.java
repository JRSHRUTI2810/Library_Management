import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBook {
    
    @Test
    public void testBookConstructor() {
        Book book = new Book("Title", "Author", "ISBN");
        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals("ISBN", book.getIsbn());
    }
}

