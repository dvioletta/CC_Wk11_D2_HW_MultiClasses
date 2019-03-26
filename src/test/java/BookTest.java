import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        this.book = new Book("Jane Eyre", "Charollet Bronte", "Romance");
    };

    @Test
    public void hasTitle() {
        assertEquals("Jane Eyre", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Charollet Bronte", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Romance", book.getGenre());
    }

}
