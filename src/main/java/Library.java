import java.util.ArrayList;

public class Library {

//    requires an array of books called stock
    private ArrayList<Book> stock;

    public Library(){
        this.stock = new ArrayList<>();
    }

//
//    method to count books
    public int getStockCount(){
        return this.stock.size();
    }

    public int addBook(){
        return this.stock.size();
    }


}
