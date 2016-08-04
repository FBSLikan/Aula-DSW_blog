/**
 * Created by sbmmartins on 8/3/16.
 */
public class PocketBook extends Book {
    public PocketBook(String name, String isbn, double price, Author author) {
        super(name, isbn, price, author);
    }

    @Override
    public boolean applyDiscount(double perc) {
        return false;
    }
}
