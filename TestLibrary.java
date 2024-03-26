import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TestLibrary {
    private Library library;
    
    @Before
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Title1", "Author1", "ISBN1"));
        library.addBook(new Book("Title2", "Author2", "ISBN2"));
    }
    
    @Test
    public void testAddBook() {
        library.addBook(new Book("New Title", "New Author", "New ISBN"));
        assertEquals(3, library.getBooks().size());
    }
    
    @Test
    public void testRemoveBook() {
        Book bookToRemove = new Book("Title1", "Author1", "ISBN1");
        library.removeBook(bookToRemove);
        assertEquals(1, library.getBooks().size());
    }
    
    @Test
    public void testSearchByAuthor() {
        List<Book> booksByAuthor = library.searchByAuthor("Author1");
        assertEquals(1, booksByAuthor.size());
        assertEquals("Title1", booksByAuthor.get(0).getTitle());
    }
    
    @Test
    public void testSearchByTitle() {
        List<Book> booksByTitle = library.searchByTitle("Title2");
        assertEquals(1, booksByTitle.size());
        assertEquals("Author2", booksByTitle.get(0).getAuthor());
    }
}

