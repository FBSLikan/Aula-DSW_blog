/**
 * Created by sbmmartins on 8/3/16.
 */
public class EBook extends Book {
    private String watermark;


    public EBook(String name, String isbn, double price, Author author, String watermark) {
        super(name, isbn, price, author);
        this.watermark = watermark;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- WaterMark: " + this.watermark);
        System.out.println("-----------------\n");
    }

    @Override
    public boolean applyDiscount(double perc) {
        if (perc > 0.15)
            return false;
        else {
            double discount = super.getPrice() * perc;
            super.setPrice(super.getPrice() - discount);
            return true;
        }
    }
}
