import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        this.library = new Library();
        this.book = new Book("Jane Eyre", "Charollet Bronte", "Romance");
    }

    @Test
        public void canGetStockCount(){
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void canAddBook(){
        library.addStock(book);
        assertEquals(1, library.addStock);
    }

    @Test
    public void cantAddMoreThanCapacity(){
        for (int i = 0; i<12; i++){
            library.addStock(book);
        }
        assertEquals(10, library.getstockCount());

}
